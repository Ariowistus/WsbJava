package Zadanie1;


import creatures.Animal;
import creatures.FarmAnimal;
import device.Car;
import device.Device;
import device.Phone;

public class Main {
    public static void main(String[] args) {
        Animal pig = new FarmAnimal("Kłikłi", 1, 10, "pig");
        pig.feed(10);
        ;

        System.out.println("mmmmm kłikłi "+pig.getWeight());
        pig.beEaten();
        System.out.println("oh No! kill pig "+pig.getWeight());

    }
}