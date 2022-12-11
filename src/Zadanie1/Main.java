package Zadanie1;


import creatures.Animal;
import device.Car;
import device.Phone;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Reksio", 5, 10, "dog");
        Car car = new Car("Audi", "Aminus11", 1994, 800);
        Phone phone = new Phone("Samsung", "Galaxy", 2019, 2000);
        Human human = new Human("Bożydar",56,80.0,"human","Bożydar","Kowalski",56,80,dog,car,phone,1000.0);
        System.out.println(human);





//        Double price= car.getPrice();
//        Double price2= car2.getPrice();
//        System.out.println(car);
//        System.out.println(car2);
//        System.out.println("CZy auta są w tej smaej cenie ?? "+price.equals(price2));
//        System.out.println();
//        System.out.println();
//
//
//        System.out.println("Tyl masz hajsu "+human.getSalary());
//        System.out.println("Ooo praca jako Java Developer ");
//        human.setSalary(10000);
//        System.out.println("Ooo praca jako Java Developer "+human.getSalary());
//
//        System.out.println("to co kupujemy jakiegoś kapcia ??");
//        human.setCar(car);
//        System.out.println("Czy masz auto "+human.getCar());


    }
}