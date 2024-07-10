class MyEmployee {
    private int id;
    private String name;

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

public class AccessModifier {
    public static void main(String[] args) {
        MyEmployee jubp = new MyEmployee();
        jubp.setName("Juabyer Al Asad");
        System.out.println(jubp.getName());
        jubp.setId(11182029);
        System.out.println(jubp.getId());

    }
}
