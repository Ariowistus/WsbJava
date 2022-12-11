package Zadanie1;


import creatures.Animal;
import device.Car;
import device.Device;
import device.Phone;

public class Main {
    public static void main(String[] args) {
        Device myCar = new Car("A6", "Audi", 2019, 100000);
        Device myPhone = new Phone("S10", "Samsung", 2019, 5000);

        System.out.println(myCar.turnOn());
        System.out.println(myPhone.turnOn());









    }
}