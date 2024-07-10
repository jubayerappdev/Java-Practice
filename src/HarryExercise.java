import java.util.Scanner;

public class HarryExercise {
    public static void main(String[] args) {
        System.out.println("Total Percentage Calculation");
        Scanner sc = new Scanner(System.in);
        float tmp = 5*100;
        System.out.println("Enter Bangla Subject Marks ");
        float a = sc.nextInt();
        System.out.println("Enter English Subject Marks ");
        float b = sc.nextInt();
        System.out.println("Enter Math Subject Marks ");
        float c = sc.nextInt();
        System.out.println("Enter Science Subject Marks ");
        float d = sc.nextInt();
        System.out.println("Enter ICT Subject Marks ");
        float e = sc.nextInt();

        float sum = a+b+c+d+e;
        System.out.println("Total Subject marks :");
        System.out.println(sum);
        float per= (sum*100)/tmp;
        System.out.println("Percentage of Result is ");
        System.out.println(per);
    }
}
