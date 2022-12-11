package device;

public class Phone extends Device {

    Boolean isOn;

    public Phone(String model, String producer, int year, double price) {
        super(model, producer, year, price);
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

    @Override
    public boolean turnOn() {

        System.out.println("Phone is on");
        return isOn = true;

    }
}
