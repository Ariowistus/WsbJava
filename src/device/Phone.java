package device;

public class Phone extends Device {
    final String model;
    final String producer;
    final int year;
    final double price;

    public Phone(String model, String producer, int year, double price) {
        super(model, producer, year, price);
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                ", price=" + price +
                "} " + super.toString();
    }
}
