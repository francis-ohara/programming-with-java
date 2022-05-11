package _5_inheritance.session2;

public class Truck extends FourWheeledVehicle{
    private TruckType truckType;
    private int numberOfAxles;
    private double maxTowPayload;

    public void setTruckType(TruckType truckType){
        this.truckType = truckType;
    }

    public TruckType getTruckType(){
        return this.truckType;
    }

    public void setNumberOfAxles(int numberOfAxles){
        this.numberOfAxles = numberOfAxles;
    }

    public int getNumberOfAxles(){
        return this.numberOfAxles;
    }

    public void setMaxTowPayload(double maxTowPayload){
        this.maxTowPayload = maxTowPayload;
    }

    public double getMaxTowPayload(){
        return this.maxTowPayload;
    }

    public Truck(){
        super();
        this.maxTowPayload = 0.00D;
        this.truckType = TruckType.PICKUP;
        this.numberOfAxles = 1;
    }

    //parameterized constructor
    public Truck(String manufacturer, String model, int seatCount, int wheelCount, int doorCount, double milesPerGallon, TruckType truckType, int numberOfAxles, double maxTowPayload){
        super(manufacturer, model, seatCount, wheelCount, doorCount, milesPerGallon);
        this.maxTowPayload = maxTowPayload;
        this.numberOfAxles = numberOfAxles;
        this.truckType = truckType;
    }
}
