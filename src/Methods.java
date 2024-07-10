public class Methods {
    static void foo() {
        System.out.println("Good Morning bro !");
    }

    static void foo(int a) {
        System.out.println("Good Morning " + a + " bro !");
    }

    static void foo(int a, int b) {
        System.out.println("Good Morning " + a + " Broo!");
        System.out.println("Good Morning " + b + " Broo!");
    }


    static void change(int a) {
        a = 98;

    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }
    static int sum(int...arr){
        int result=0;
        for (int a:arr){
            result+=a;
        }
        return result;
    }

    static void tellJoke() {
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    public static void main(String[] args) {
        tellJoke();

        // Case 1: Changing the Integer
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is: " + x);

//         Case 1: Changing the Array
//         int [] marks = {52, 73, 77, 89, 98, 94};
//         change2(marks);
//         System.out.println("The value of x after running change is: " + marks[0]);

//        Method overloading
//        foo();
//        foo(4000);
//        foo(300, 400);
//        // Argument are actual;
//        VArArrgs

//        System.out.println("The sum of 2,3, and 5 is : "+sum(2,3 ,5));
//        System.out.println("The sum of 2,3,4 and 5 is : "+sum(2,3,4 ,5));
//        System.out.println(sum(1,2,3,4,5,6,7,8,9,11,2,2,2));
    }
}
