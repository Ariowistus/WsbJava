package creatures;

public class Pet  extends Animal{
    public Pet(String name, int age, double weight, String species) {
        super(name, age, weight, species);
    }


    @Override
    public void feed() {
        System.out.println("I'm a pet, I don't eat");
    }

    @Override
    public void feed(double foodWeight) {
        System.out.println("I'm a pet, I don't eat");
    }

    @Override
    public void beEaten() {

    }
}
