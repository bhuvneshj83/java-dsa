public class Practice {

    static int add(int a, int b) {
        int ans = a + b;
        return ans;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static int getMaximum(int n,int m) {
        if (n > m) {
            return n;
        } else {
            return m;
        }
    }


    public static void main(String[] args) {
        int result =getMaximum(10, 7);
        System.out.println(result);

//        System.out.println(isEven(8));
//        System.out.println(isEven(9));
//        int result = add(2, 4);
//        System.out.println(result);
    }
}


