//import java.util.Scanner;
//
//public class HackerRank {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int n = scan.nextInt();
////        double d = scan.nextDouble();
////        scan.nextLine();
////        String s = scan.nextLine();
////
////
////        System.out.println("String :" +s);
////        System.out.println("Double :" +d);
////        System.out.println("Integer :" +i);
//
//        for (int i=1;i<=10;i++){
//            System.out.printf("%d x %d = %d\n",n ,i, n*i);
//        }
//
//    }
//}
import java.util.Scanner;
import java.io.*;

class HackerRank{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=a;
            for(int j=0;j<n;j++)
            {
                sum=sum+(int)(Math.pow(2,j))*b;
                System.out.printf("%d ",sum);
            }
            System.out.printf("\n");

        }
        in.close();

//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
//
//            System.out.printf("%-15s%03d\n", s1, x);
//        }
//        System.out.println("================================");
    }
}
