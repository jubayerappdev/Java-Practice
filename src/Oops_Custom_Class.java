
class Employee{
    int id;
    int salary;
    String name;

    public void printDetails(){
        System.out.println("My Id is "+id);
        System.out.println("And my name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class Oops_Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is a custom class");

        Employee jubo = new Employee();//Instantiating a new Employee Object
        Employee juba = new Employee();//Instantiating a new Employee Object
        //Setting Attribute
        jubo.id=1101;
        jubo.name="Jubayer";
        jubo.salary=17;
        juba.id=1111;
        juba.name="Asad";
        juba.salary=14;
//Printing the attribute
        jubo.printDetails();
//        int salary=jubo.getSalary();
        juba.printDetails();
        int salary=juba.getSalary();
        System.out.println(salary);
        System.out.println(jubo.id);
        System.out.println(jubo.name);
        System.out.println(juba.id);
        System.out.println(juba.name);

    }
}
