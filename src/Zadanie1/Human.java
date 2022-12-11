//package Zadanie1;
//
//import creatures.Animal;
//import device.Car;
//import device.Phone;
//
//import java.time.LocalDateTime;
//
//public class Human  {
//    private final String name;
//    private final String surname;
//    private final int age;
//    private final int weight;
//    private final Animal pet;
//    private Car car;
//    private final Phone phone;
//
//    private double salary;
//
//    public Human(String name, int age, double weight, String species, String name1, String surname, int age1, int weight1, Animal pet, Car car, Phone phone, double salary) {
//        super(name, age, weight, species);
//        this.name = name1;
//        this.surname = surname;
//        this.age = age1;
//        this.weight = weight1;
//        this.pet = pet;
//        this.car = car;
//        this.phone = phone;
//        this.salary = salary;
//    }
//
//
//
//    public double getSalary() {
//        System.out.println("Getting salary data at: " + LocalDateTime.now() + ", salary: " + this.salary);
//        return this.salary;
//    }
//
//    public void setSalary(double salary) {
//        if (salary < 0) {
//            System.out.println("Cannot set negative salary value.");
//            return;
//        }
//
//        System.out.println("nowe dane zostały wysłane do systemu księgowego");
//        System.out.println("koniecznie odbierz  aneks do umowy od pani Hani z kadr");
//        System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
//
//        this.salary = salary;
//    }
//    public void setCar(Car car) {
//        if (car == null) {
//            System.out.println("Car cannot be null.");
//            return;
//        }
//
//        if (this.salary >= car.getPrice()) {
//            System.out.println("dało się kupić za gotówkę");
//        } else if (this.salary >= (car.getPrice() / 12)) {
//            System.out.println("udało się kupić na kredyt ");
//        } else {
//            System.out.println("zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
//            return;
//        }
//
//        this.car = car;
//    }
//
//    public Car getCar() {
//        return car;
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    @Override
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public double getWeight() {
//        return weight;
//    }
//
//    public Animal getPet() {
//        return pet;
//    }
//
//    public Phone getPhone() {
//        return phone;
//    }
//
//    @Override
//    public String toString() {
//        return "Human{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", age=" + age +
//                ", weight=" + weight +
//                ", pet=" + pet +
//                ", car=" + car +
//                ", phone=" + phone +
//                ", salary=" + salary +
//                "} " + super.toString();
//    }
//}
//
//
//
//
