import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {

        int a = 7;
        int b = 9;
        System.out.println(a + b);

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value for first num ");
//        int firstnum = sc.nextInt();
//        System.out.println("Enter the value for second num ");
//        int secondNum = sc.nextInt();
//        int num = (firstnum + secondNum);
//        System.out.println("Answer of above variables is " + num);

        System.out.println("Enter the value for bg");
        boolean bg = sc.nextBoolean();
        System.out.println("bg is " + bg);

        System.out.println("Enter the value of flag");
        BigInteger flag = sc.nextBigInteger();
        System.out.println("flag is very big as " + flag);

        System.out.println("Enter the value of big ");
        BigDecimal big = sc.nextBigDecimal();
        System.out.println("big decimal is as big as" + big);

        sc.close();


    }
}
