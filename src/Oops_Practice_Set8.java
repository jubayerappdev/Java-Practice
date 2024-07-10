class Employee1{
int salary;
String name;
public int getSalary(){
    return  salary;
}
public String getName(){
    return name;
}
public void setName(String n){
    name=n;

}
}
class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }

}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle{
    int w;
    int l;
    public int area(){
        return w*l;
    }
    public int perimeter(){
        return 2*(l+w);
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
class Circle{
    float py=3.1416f;
    int r;
    public float area(){
        return py*(r*r);
    }
}

public class Oops_Practice_Set8 {
    public static void main(String[] args) {
        // Problem 1
        Employee1 jubo = new Employee1();
        jubo.setName("CodeWithJubo");
        jubo.salary = 233;
        System.out.println(jubo.getSalary());
        System.out.println(jubo.getName());
        //Problem 2
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();

        // Problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        //Problem 4
        Rectangle rt = new Rectangle();
        rt.w=4;
        rt.l=10;
        System.out.println(rt.area());
        System.out.println(rt.perimeter());

        // Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

        //Problem 5

        Circle cc= new Circle();
        cc.r=5;
        System.out.println("The area of a circle is "+cc.area());


    }
}
