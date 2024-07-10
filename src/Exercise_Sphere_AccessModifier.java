class Sphere{
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
    public float volume(){
        return (float) (4/3f*Math.PI*radius*radius*radius);
    }
}
public class Exercise_Sphere_AccessModifier {
    public static void main(String[] args) {
        Sphere mySphere = new Sphere(9);
//        mySphere.setRadius(9);
        System.out.println(mySphere.getRadius());
        System.out.println(mySphere.surfaceArea());
        System.out.println(mySphere.volume());


    }
}
