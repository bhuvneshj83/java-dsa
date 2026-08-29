public class conditionals {
    public static void main(String[] args) {

        // If statement
        int dailyPractice = 12;

        if (dailyPractice >= 10) {
            System.out.println("good consistency");

            int age = 76;

            if (age > 18) {
                System.out.println("you are eligible to vote ");

                // If - else condition

                int marks = 40;

                if (marks >= 50) {
                    System.out.println("pass");
                } else {
                    System.out.println("fail");

                    // if-else-if ladder

                    int photos = 56;

                    if (photos >= 60) {
                        System.out.println("Nice photos");
                    } else if (photos >= 67) {
                        System.out.println("bad photos ");
                    } else if (photos >= 56) {
                        System.out.println("amazing photos ");
                    } else {
                        System.out.println("i'm not good");
                    }
                    System.out.println("Sab sahi h bro");

                    //Nested-If condition

                    int age1 = 20;
                    char Gender = 'm';

                    if (age >= 18) {
                        System.out.println("you're an adult");
                        if (Gender == 'm') {
                            System.out.println("the person is male");
                        } else {
                            System.out.println("the person is female");
                        }

                    } else {
                        System.out.println("you're not an adult");
                    }

                    if (Gender == 'm') {
                        System.out.println("the person not a female");
                    } else {
                        System.out.println("the person is not a male");
                    }

                    // Ternary operator

                    int streakdays = 30;

                    String status = (streakdays >= 35) ? "you're inconsistent " : "you're consistent";

                    System.out.println(status);

                    int age2 = 10;

                    int ans = (age2 > 18) ? 22 : 12;
                    System.out.println(ans);
                }

                // Switch statement

                int day = 2;

                switch (day) {

                    case 1:
                        System.out.println("Monday");


                    case 2:
                        System.out.println("Tuesday");

                    case 3:
                        System.out.println("Wednesday");
                        break;

                    default:
                        System.out.println("Invalid day");
                }
            }
        }
    }
}


