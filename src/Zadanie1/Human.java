package Zadanie1;

import java.time.LocalDateTime;

public class Human {
    private final String name;
    private final String surname;
    private final int age;
    private final int weight;
    private final Animal pet;
    private  Car car;

    private double salary;

    public Human(String name, String surname, int age, int weight, Animal pet, Car car) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.pet = pet;
        this.car = car;
    }

    public double getSalary() {
        System.out.println("Getting salary data at: " + LocalDateTime.now() + ", salary: " + this.salary);
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Cannot set negative salary value.");
            return;
        }

        System.out.println("nowe dane zostały wysłane do systemu księgowego");
        System.out.println("koniecznie odbierz  aneks do umowy od pani Hani z kadr");
        System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");

        this.salary = salary;
    }
    public void setCar(Car car) {
        if (car == null) {
            System.out.println("Car cannot be null.");
            return;
        }

        if (this.salary >= car.getPrice()) {
            System.out.println("dało się kupić za gotówkę");
        } else if (this.salary >= (car.getPrice() / 12)) {
            System.out.println("udało się kupić na kredyt ");
        } else {
            System.out.println("zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
            return;
        }

        this.car = car;
    }

    public Car getCar() {
        return car;
    }
}




