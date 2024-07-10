class Animal{
    public String animal;
    public void PrintMe(){
        System.out.println("Myself Constructor");
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        System.out.println("I'm The Ancestor");
        this.animal = animal;
    }

}
class Dog extends Animal{
    public String bark;

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        System.out.println("I'm an animal, DOG!!");
        System.out.println("Barking!!!");
        this.bark = bark;
    }
}
public class ConstructorInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal printMe = new Animal();

        animal.setAnimal("Listen to me.");
        System.out.println(animal.getAnimal());
        Dog bark = new Dog();
        bark.setBark("Ghew Ghew!!");
        System.out.println(bark.getBark());


    }
}
