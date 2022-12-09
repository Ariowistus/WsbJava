package Zadanie1;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Reksio", 5, 10, "dog");
        Car car = new Car("Audi", "Aminus11", 1994, 800);
        Car car2 = new Car("Audi", "Aminus10", 1994, 900);
        Human human = new Human("Jan", "Kowalski", 30, 80, dog, car);

        Double price= car.getPrice();
        Double price2= car2.getPrice();
        System.out.println(car);
        System.out.println(car2);
        System.out.println("CZy auta są w tej smaej cenie ?? "+price.equals(price2));
        System.out.println();
        System.out.println();


        System.out.println("Tyl masz hajsu "+human.getSalary());
        System.out.println("Ooo praca jako Java Developer ");
        human.setSalary(10000);
        System.out.println("Ooo praca jako Java Developer "+human.getSalary());

        System.out.println("to co kupujemy jakiegoś kapcia ??");
        human.setCar(car);
        System.out.println("Czy masz auto "+human.getCar());


    }
}