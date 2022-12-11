package creatures;

public abstract class Animal implements FeedAble {
    private final String name;
    private final int age;
     double weight;
    private final String species;


    public Animal(String name, int age, double weight, String species) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }
}