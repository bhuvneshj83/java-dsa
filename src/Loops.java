public class Loops {
    public static void main(String[] args) {

        //first loop (for)

        for (int i = 1; i <= 5; i += 2) {
            System.out.println("Value of i is " + i);
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("BHUVNESH JANGID");
        }

        // Nested loop

        for (int j = 1; j <= 4; j++) {
            for (int n = 1; n <= 4; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 4; i++) {
                System.out.println("j = " + j + ", i = " + i);
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 6 || i == 7 || i == 8) {
                continue;
            }
            System.out.println(i);
        }

        // While loop
        int i = 1;
        //condition
        while (i <= 10) {
            //process
            System.out.println("Jangid ");
            //updation
            i++;


        }
    }
}
