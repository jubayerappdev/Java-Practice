import java.util.Scanner;

public class ConditionPractice {
    public static void main(String[] args) {
        //Question 2
//        byte m1, m2, m3;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Please Enter your marks in Physics");
//        m1 =sc.nextByte();
//        System.out.println("Please Enter your marks in English");
//        m2 =sc.nextByte();
//        System.out.println("Please Enter your marks in Chemistry");
//        m3 =sc.nextByte();
//
//        float avg =(m1+m2+m3)/3.0f;
//
//        System.out.println("Your Overall average number : "+avg);
//
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//
//            System.out.println("Congratulation!! You have been promoted.");
//        }else {
//            System.out.println("Sorry!! You have not been promoted. Please Try again.");
//        }
        //Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Annual Income in Lacs :");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5f){
//            tax=tax+0;
//        } else if (income>2.5f && income<=5.0f) {
//            tax = tax +0.05f *(income-2.5f);
//
//        } else if (income>5.0f && income<=10.0f) {
//            tax=tax+0.05f *(income-2.5f);
//            tax=tax+0.02f *(income-5f);
//
//        }else if (income>10.0f) {
//            tax=tax+0.05f *(income-2.5f);
//            tax=tax+0.02f *(income-5.0f);
//            tax=tax+0.03f *(income-10.0f);
//
//    }
//        System.out.println("The total tax paid by Employee is : "+tax);
        //Question 4
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1 -> System.out.println("Sunday");
//            case 2 -> System.out.println("Monday");
//            case 3 -> System.out.println("Tuesday");
//            case 4 -> System.out.println("Wednesday");
//            case 5 -> System.out.println("Thursday");
//            case 6 -> System.out.println("Friday");
//            case 7 -> System.out.println("Saturday");
//        }
        //Question 5 Leap year

//        int y;
//        System.out.println("Enter the year for check : ");
//        Scanner sc = new Scanner(System.in);
//        y= sc.nextInt();
//        if ((( y % 4 == 0) && (y % 100 != 0 )) || (y % 400 == 0)){
//            System.out.println("Entered Year is a leap year!");
//        }else {
//            System.out.println("Entered Year is not a leap year!");
//        }

        //Question 6
        Scanner sc=new Scanner(System.in);
        String WebSite= sc.next();
        if (WebSite.endsWith(".org")){
            System.out.println("This is an Organizational website.");
        } else if (WebSite.endsWith(".com")){
            System.out.println("This is a Commercial website.");
        } else if (WebSite.endsWith(".bd")){
            System.out.println("This is a Bangladeshi website.");
        }



    }

}
