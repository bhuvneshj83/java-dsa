public class Patterns {
    public static void main(String[] args) {


//        int u = 5;
//
//        for (int row = 1; row <= u; row++) {
//            // for each row -> spaces, stars
//
//            //spaces
//            for (int col = 1; col <= u - row; col++) {
//                System.out.print(" ");
//            }
//            //stars
//            for (int col = 1; col <= u; col++) {
//                System.out.print("* ");
//            }
//            //move to next row
//            System.out.println();
//        }


//        int m = 5;
//
//        for (int row = 1; row <= m; row++) {
//            for (int col = 1; col <= m - row + 1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//            //spaces
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//            //stars
//            for (int col = 1; col <= 2 * row - 1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println( );
//        }
//
////        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//            // for spaces
//            if(row == 1){
//                continue;
//            }
//            for (int col = 1; col <= row - 1; col++) {
//                System.out.print("  ");
//            }
//            // for stars
//            for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        int m = 4;
//
//        for (int row = 1; row <= m; row++) {
//            // for each row -> 6 columns
//            for (int col = 1; col <= 6; col++) {
//                if (row == 1 || row == 4) {
//                    System.out.print("* ");
//                } else {
//                    if (col == 1 || col == 6) {
//                        System.out.print("* ");
//                    } else {
//                        //middle columns
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();

//        int n = 6;
//
//        for (int row = 1; row <= n; row++) {
//            if (row == 1 || row == 2 || row == n) {
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("* ");
//                }
//            } else {
//                System.out.print("* ");
//                for (int col = 1; col <= (row - 2); col++) {
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println( );
//        }

//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//            //for each row -> variable col
//            //part 1
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//            //part 2
//            if (row == 1) {
//                for (int col = 1; col <= 2 * row - 1; col++) {
//                    System.out.print("* ");
//                }
//            } else {
//                //middle rows
//                //1 star
//                System.out.print("* ");
//                //2r -3 space
//                for (int col = 1; col <= 2 * row - 3; col++) {
//                    System.out.print("  ");
//                }
//                //1*
//                System.out.print("* ");
//            }
//            //movw to next line
//            System.out.println();
//        }
//
//        //part 2
//        for (int row = 1; row <= n - 1; row++) {
//            // part 1
//            for (int col = 1; col <= row; col++) {
//                System.out.print("  ");
//            }
//            //part 2
//            if (row == n - 1) {
//                System.out.print("* ");
//            } else {
//                //remaining rows
//                //1*
//                System.out.print("* ");
//                //2(n-r)-3) spaces
//                for (int col = 1; col <= 2 * (n - row) - 3; col++) {
//                    System.out.print("  ");
//                }
//                //1*
//                System.out.print("* ");
//            }
//            //move to next line
//            System.out.println();
//        }


//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//            //spaces
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//            //stars
//            for (int col = 1; col <= 2 * row - 1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println( );
//        }
//
//
//        for (int row = 1; row <= n; row++) {
//            // for spaces
//            if(row == 1){
//                continue;
//            }
//            for (int col = 1; col <= row - 1; col++) {
//                System.out.print("  ");
//            }
//            // for stars
//            for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        int m = 4;
//
//        //part 1
//        for (int row = 1; row <= m; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//
//            //part 2
//            for (int col = 1; col <= 2 * (m - row); col++) {
//                System.out.print("  ");
//            }
//
//            //part3
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        //part 4
//        for (int row = 1; row <= m; row++) {
//            for (int col = 1; col <= m - row + 1; col++) {
//                System.out.print("* ");
//            }
//
//             //part 5
//            for (int col = 1; col <= 2 * (row - 1); col++) {
//                System.out.print("  ");
//            }
//
//            //part 6
//            for (int col = 1; col <= m - row + 1; col++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//    }
//}// here stars problem are done now numbers problem


//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col + " ");
//            }
//
//            System.out.println();
//        }
//
//        // right angle triangle numbers
//        int m = 5;
//        int count = 1;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(count + " ");
//                count++;
//            }
//            System.out.println();
//        }
//
//        int k = 5;
//
//        for (int row = 1; row <= k; row++) {
//            for (int col = 1; col <= row; col++) {
//                int a = col;
//                int b = ('A' - 1);
//                int ans = a + b;
//                char finalAns = (char) ans;
//                System.out.print(finalAns + " ");
//            }
//            System.out.println();
//        }
//
//        int a = 5;
//
//        for (int row = 1; row <= a; row++) {
//            for (int col = 1; col <= row; col++) {
//                int j = n - col;
//                int l = 'A';
//                int ans = j + l;
//                char finalAns = (char) ans;
//                System.out.print(finalAns + " ");
//            }
//            System.out.println();
//        }

        int b = 4;

        //part 1
        for (int row = 1; row <= b; row++) {
            for (int col = 1; col <= b - row; col++) {
                System.out.print("  ");
            }

            // part 2
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            //part 3
            int rowValue = row;
            int decrowValue = row - 1;
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(decrowValue + " ");
                decrowValue--;
            }

            System.out.println();
        }

        // 1 more pattern
        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // part 2 of this
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print(row + " ");
            }
            System.out.println();

        }

        // new one
        int m = 4;

        for (int row = 1; row <= m; row++) {
            //part 1
            for (int col = 1; col <= m - row; col++) {
                System.out.print("  ");
            }
            //part 2
            for(int col = 1; col<=row; col++){
                int a = col;
                int f = 'A'-1;
                int ans = a+f;
                char finalAns = (char)ans;
                System.out.print(finalAns+" ");
            }
            //part 3
            char toPrint = (char)(row + 'A' -2);
            for (int col =1; col<=row-1;col++){
                System.out.print(toPrint +" ");
                toPrint--;
            }
            System.out.println();
        }
    }
}



