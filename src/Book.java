import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
//       String ascii="___  ________     ___       _                              ___  _                        _ \n" +
//               "|  \\/  |  _  \\   |_  |     | |                            / _ \\| |                      | |\n" +
//               "| .  . | | | |     | |_   _| |__   __ _ _   _  ___ _ __  / /_\\ \\ |__  _ __ ___   ___  __| |\n" +
//               "| |\\/| | | | |     | | | | | '_ \\ / _` | | | |/ _ \\ '__| |  _  | '_ \\| '_ ` _ \\ / _ \\/ _` |\n" +
//               "| |  | | |/ /  /\\__/ / |_| | |_) | (_| | |_| |  __/ |    | | | | | | | | | | | |  __/ (_| |\n" +
//               "\\_|  |_/___/   \\____/ \\__,_|_.__/ \\__,_|\\__, |\\___|_|    \\_| |_/_| |_|_| |_| |_|\\___|\\__,_|\n" +
//               "                                         __/ |                                             \n" +
//               "                                        |___/                                              ";
//        System.out.println(ascii);

//        double value = 0;
//        value+=6.6;
//        value+=9.8;
//        System.out.println(value);
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the temperature in Celsius ");
//
//        float C= sc.nextFloat();
//        float F=(float) (9.0/5.0*C)+32;
//
//        System.out.println("Your Temperature in Fahrenheit ");
//        System.out.println(F);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your weight in Kg");

        float w=sc.nextFloat();
        System.out.println("Enter your height in meter ");
        float h= sc.nextFloat();

        float bmi=w/(h*h);
        System.out.println("Your BMI is : "+bmi);
   }
}


