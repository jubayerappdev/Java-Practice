public class MethodsPractice {
    static void multiplication(int n){
        for (int i=1; i<=10; i++){
            System.out.format("%d X %d =%d \n",i,n,i*n);
        }
    }
    static void pattern(int n){
        for (int i=1; i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static  int sumRec(int n){
        if (n==1){
            return 1;
        }
        return n+sumRec(n-1);
    }
    static void pattern2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fibonacci(int n){
        if (n==0 || n==1){
            return n;
        } else {
            return fibonacci(n-1)+ fibonacci(n-2);
        }
    }
    static void pattern1_rec(int n){
        if (n>0){
            pattern1_rec(n-1);
            for (int i=0; i<n;i++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        //Problem 1
//       multiplication(7);
////       Problem 2
//        pattern(4);
//        //Problem 3
//        int c = sumRec(4);
//        System.out.println(c);
        //Problem 4
//            pattern2(4);
//            //Problem 5
//                int x=8;
//        System.out.println(fibonacci(x));
        //Problem 8
//        pattern1_rec(6);

     



    }
}
