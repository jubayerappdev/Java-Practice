import java.util.Scanner;

public class LoopsPractice {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        // *Print
//        for(int i=n; i>0; i--){
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//
//        }
        //even number print
//        int sum=0;
//        for (int i=0;i<n;i++){
//            sum=sum+(2*i);
//        }
//        System.out.print("Sum of the even numbers :");
//        System.out.println(sum);
        //Multiplication table
       // for (int i=1; i<=10 ; i++)
        //reverse multiplication
//        for (int i=10; i>=1 ; i--)
//        {
//            System.out.printf("%d X %d = %d\n", n,i,n*i);
//        }
//        /find factorial of a gven number
//        int factorial=1;
//        for (int i=factorial;i<=n; i++){
//            factorial*=i;
//        }
//        System.out.printf("The factorial of given number %d is = %d",n,factorial);
        // sum of multiplication
        int sum=0;
        for (int i=1; i<=10 ; i++){
            System.out.printf("%d X %d = %d\n", n,i,n*i);
           sum += (n*i);
        }
        System.out.printf("The sum of multiplication of %d in = %d",n,sum);

    }
}
