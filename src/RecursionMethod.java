public class RecursionMethod {
    static int factorial(int n){
        if (n==0 || n==1){
            return n;
        }else {
            return n*factorial(n-1);
        }

    }
    static int fibonacci(int n){
        if (n==0 || n==1){
            return n;
        } else {
            return fibonacci(n-1)+ fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
//        int x= 5;
//        System.out.println("The value of x factorial is\t"+factorial(x));

        final int ARRAY_LENGTH =10;
        int[] a = new int[ARRAY_LENGTH];
        for (int i=0; i<a.length; i++){
            a[i]=fibonacci(i);
        }
        System.out.println("Index\tValue");
        for (int i=0; i<a.length; i++) {
            System.out.println(i + "\t\t" +a[i]);
        }

//        int x=0;
//        System.out.println(fibonacci(x)); //0, 1, 1, 2, 3, 5, 8, 13, 21

    }
}
