package Zadanie1;

import java.util.Objects;

public class Car {
    final String model;
    final String producer;
    final int year;
    private final double price;

    public Car(String model, String producer, int year, double price) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (Double.compare(car.price, price) != 0) return false;
        if (!Objects.equals(model, car.model)) return false;
        return Objects.equals(producer, car.producer);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = model != null ? model.hashCode() : 0;
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        result = 31 * result + year;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
