public class Methods {
    //declaration / defination
    static void print2table() {
        for(int i =1; i<=10;i++){
            int ans = 2*i;
            System.out.println("-> " + ans);
        }
    }

    static void printsum(int x, int y) {
        System.out.println("SUM " + (x + y));
    }

    static void printMultiplication(int a , int b){
        int ans1 = a*b;
        System.out.println(ans1);
    }

    static int main (int a , int b){
        int sum= a+b;
        return sum;
    }

    static int main(int a , int b, int c){
        int ans = a+b+c;
        return ans;
    }

    static void solve(int num){
        System.out.println("inside solve : " +num );
        num = num*10;
        System.out.println("inside solve :" +num );
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("inside main :" +num );
        solve(num);
        System.out.println("inside main :" +num );



//        int ans1 = main(8,7);
//        int ans2 = main(5,6,7);
//        System.out.println("ans 1: " + ans1);
//        System.out.println("ans 2: " + ans2);
//        printMultiplication(7,9);
//        printsum(5,6);
    }


    }


