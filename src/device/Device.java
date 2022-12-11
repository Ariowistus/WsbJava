package device;

public abstract class Device {
    final String model;
    final String producer;
    final int year;
    final double price;
    Boolean isOn;

    public Device(String model, String producer, int year, double price) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.price = price;
        this.isOn = false;
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
    public abstract boolean turnOn();
}
