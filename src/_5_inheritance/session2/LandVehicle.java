package _5_inheritance.session2;

public class LandVehicle extends Vehicle{
    private int wheelCount;

    public void setWheelCount(int wheelCount){
        this.wheelCount = wheelCount;
    }

    public int getWheelCount(){
        return this.wheelCount;
    }

    public LandVehicle(){
        super();
        this.wheelCount = 0;
    }
    public LandVehicle(String manufacturer, int seatCount, int wheelCount){
        super(manufacturer, seatCount);
        this.wheelCount = wheelCount;
    }

    @Override
    public void move(String destination){
        System.out.printf("%s with wheel count %d has moved from current location to %s.\n", this.getManufacturer(), this.getWheelCount(), destination);
    }
}
