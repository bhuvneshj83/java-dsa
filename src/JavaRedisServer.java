import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;

public class JavaRedisServer {
    // The core in-memory storage
    private static final ConcurrentHashMap<String, String> database = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        int port = 6379;
        System.out.println("Starting Java-Redis server on port " + port + "...");

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                // Wait for a client connection (e.g., from redis-cli)
                Socket clientSocket = serverSocket.accept();
                handleClient(clientSocket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket clientSocket) {
        try (
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                OutputStream out = clientSocket.getOutputStream()
        ) {
            String line;
            while ((line = in.readLine()) != null) {
                // Highly simplified parser assuming raw text for testing
                // Real Redis requires parsing RESP Arrays (*3\r\n...)
                String[] tokens = line.split(" ");
                String command = tokens[0].toUpperCase();

                if ("SET".equals(command) && tokens.length >= 3) {
                    database.put(tokens[1], tokens[2]);
                    out.write("+OK\r\n".getBytes());
                } else if ("GET".equals(command) && tokens.length >= 2) {
                    String value = database.get(tokens[1]);
                    if (value == null) {
                        out.write("$-1\r\n".getBytes()); // RESP Null Bulk String
                    } else {
                        out.write(("$" + value.length() + "\r\n" + value + "\r\n").getBytes());
                    }
                } else {
                    out.write("-ERR unknown or malformed command\r\n".getBytes());
                }
                out.flush();
            }
        } catch (IOException e) {
            System.out.println("Client disconnected.");
        }
    }
}
