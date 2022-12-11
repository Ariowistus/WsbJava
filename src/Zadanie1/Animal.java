package Zadanie1;

public class Animal {
    private final String name;
    private final int age;
    private double weight;
    private final String species;


    public Animal(String name, int age, double weight, String species) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    public void feed() {
        if (this.weight <= 0) {
            System.out.println("The animal is deceased. Cannot feed.");
            return;
        }

        this.weight += 1;
    }

    public void takeForAWalk() {
        if (this.weight <= 0) {
            System.out.println("The animal is deceased. Cannot take for a walk.");
            return;
        }

        this.weight -= 1;

        if (this.weight == 0) {
            System.out.println("The animal has died from exhaustion.");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getSpecies() {
        return species;
    }
}