package creatures;

public class FarmAnimal extends Animal implements Edbile {
    public FarmAnimal(String name, int age, double weight, String species) {
        super(name, age, weight, species);
    }

    @Override
    public void beEaten() {
        this.weight = 0;
    }

    @Override
    public void feed() {
        this.weight += 1;
    }

    @Override
    public void feed(double foodWeight) {
        this.weight += foodWeight;

    }

}
