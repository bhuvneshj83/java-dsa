import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // maximum value in 2d array
        int crr[][] = {
                {1, 8, 6},
                {6, 7, 45},
        };

        int maxValue = crr[0][0];

        for (int row = 0; row< crr.length; row++) {
            for (int col = 0; col < crr[row].length; col++) {
                if (crr[row][col] > maxValue) {
                    maxValue = crr[row][col];
                }
            }
        }
        System.out.println(maxValue);




                //Multiplication in 2d array

//        int crr[][] = {
//                {1,8,6},
//                {6,7,8},
//        };
//        int sum = 1;
//
//        for (int row = 0; row < crr.length; row++){
//            for (int col= 0; col < crr[row].length; col++){
//                sum = sum * crr[row][col];
//            }
//        }
//
//        System.out.println(sum);


                // addition in 2d array
//        int[][] arr = {
//                {1,4,5},
//                {4,5,7},
//        };
//        int sum = 0;
//
//        for (int row = 0; row < arr.length; row++){
//            for(int col = 0; col <arr[row].length; col++){
//                sum = sum + arr[row][col] ;
//            }
//        }
//        System.out.println(sum);

//        //declaration
//        int[][] arr;
//        //allocation
//        arr = new int[3][4];
//        //initialization
////        int[][] brr =  {
////                {3, 4},
////                {5, 6, 4, 6},
////                {7, 8, 7},
////                {1,4},
////        };
//
//        Scanner sc = new Scanner(System.in);
//
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.println("provide the value for row= " + row + "and column= " + col);
//                arr[row][col] = sc.nextInt();
//            }
//        }
//
//
//        for (int rowindex = 0; rowindex < arr.length; rowindex++){
//            for (int col = 0; col < arr[rowindex].length; col++){
//                System.out.print(arr[rowindex][col] + " ");
//            }
//            System.out.println();
//        }}

//
//        for (int row = 0; row < brr.length; row++) {
//            for (int col = 0; col < brr[0].length; col++) {
//                System.out.print(brr[row][col] + " ");
//            }
//            System.out.println();
//        }
//

                // traversal in 2d array
//        for(int row = 0; row< brr.length; row++){
//            for(int col = 0; col<brr[row].length; col ++){
//                System.out.print(brr[row][col] + " ");
//            }
//            System.out.println();
//        }
//    }
//}


                // how to find minimum value in array
//        int[] arr = {65, -7, 76, 4, 54};
//        int minValue = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < minValue) {
//                minValue = arr[i];
//            }
//        }
//        System.out.println("the minimum value of this array is " + minValue);
//    }
//}

                //how to find the maximum value in a array
//        int [] brr = {65, -7, 76,4 ,54};
//        int num = brr.length;
//        int maxValue = arr[0];
//
//        for(int i = 0; i<= num-1; i++){
//            if(arr[i] > maxValue){
//                maxValue = arr[i];
//            }
//        }
//        System.out.println("the maximum value of the array is " + maxValue);


                //multiplication in array
//        int[] arr = {2,3,10,20};
//        int ans = 1;
//        int num = arr.length;
//
//        for(int i = 0; i<=num-1; i++){
//            int value = arr[i];
//            ans = ans*value;
//        }
//
//        System.out.println("the value of multiplication is " + ans);

                //addition in array
//        int crr[] = {12,23,34,44,56};
//        int sum = 0;
//        int n = crr.length;
//
//        for(int i = 0; i<n-1; i++){
//            int value = crr[i];
//            sum = sum + value;
//        }
//
//        System.out.println(sum);


//        int[] arr = new int[5];

//        int n = arr.length;
//        //taking input
//        for (int i = 0; i < n; i++) {
//            System.out.println("Provide input for index " + i);
//            arr[i] = sc.nextInt();
//        }
//
//        // printing our array
//        System.out.println("Your arrat contains");
//        for (int val : arr) {
//            System.out.println(val);
//        }


//        //declaration
//        int [] arr;
//
//        // Allocation
//        arr = new int [5];
//
//        // Initialization
//        int brr [] = {45, 56, 65, 23, 24};
//
//        int n = brr.length;
//
//        //for each loop method
//        for(int val: brr){
//            System.out.println(val);
//        }
//
//
//        // conventional for loop method
//        for(int index = 0; index<=n-1; index++){
//            System.out.println(brr[index]);
//        }

//        System.out.println("Value at 0 index is " + brr[0]);
//        System.out.println("Value at 1 index is " + brr[1]);
//        System.out.println("Value at 2 index is " + brr[2]);
//        System.out.println("Value at 3 indec is " + brr[3]);
        }
    }
