package device;

public class Device {
    final String model;
    final String producer;
    final int year;
    final double price;

    public Device(String model, String producer, int year, double price) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Device{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
