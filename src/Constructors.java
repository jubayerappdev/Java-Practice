class MyEmployee1 {
    int id;
    String name;

    public MyEmployee1(){
        this.id=12;
        this.name="Jubayer Al Asad";
    }

    public MyEmployee1(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public MyEmployee1( String name) {
        this.id = 11;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructors {
    public static void main(String[] args) {

//        MyEmployee1 juba = new MyEmployee1(12, "Jubayer Ahmed");
        MyEmployee1 juba = new MyEmployee1("Arif");

        System.out.println(juba.id);
        System.out.println(juba.name);

    }
}
