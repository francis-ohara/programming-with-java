package _5_inheritance.session2;

public class Vehicle {
    private String manufacturer;
    private int seatCount;

    public Vehicle() {
        this.manufacturer = "Unknown";
        this.seatCount = 0;
    }

    public Vehicle(String manufacturer, int seatCount) {
        this.manufacturer = manufacturer;
        this.seatCount = seatCount;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return this.seatCount;
    }

    public void move(String destination){
        System.out.printf("%s is moving from current location to %s.%n", this.manufacturer, destination);
    }

}

