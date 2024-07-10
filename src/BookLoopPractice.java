import java.util.Scanner;

public class BookLoopPractice {
    public static void main(String[] args) {
        int  n=8;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();

//        for(int i=1; i<=n; i++){
//            for (int j=0; j<i; j++){
//                System.out.print("# ");
//            }
//            System.out.print("\n");
//
//        }
//        for (int i=n; i>=1; i--){
//            for (int j=0; j<i; j++){
//                System.out.print("# ");
//            }
//            System.out.print("\n");
//        }

//        for (int i = n; i>=1; i--){
//            for(int k=n; k>i; k--){
//                System.out.print(" ");
//            }
//            for (int j= 0; j<i; j++){
//                System.out.print("#");
//            }
//            System.out.println();
//        }
        for (int i = 1; i<=n; i++){
            for(int k=n; k>i; k--){
                System.out.print(" ");
            }
            for (int j= 0; j<i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
