package _5_inheritance.session2;

public class FourWheeledVehicle extends LandVehicle {
    private String model;
    private int doorCount;
    private double milesPerGallon;

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }
    public void setDoorCount(int doorCount){
        this.doorCount = doorCount;
    }

    public int getDoorCount(){
        return this.doorCount;
    }

    public void setMilesPerGallon(double milesPerGallon){
        this.milesPerGallon = milesPerGallon;
    }

    public double getMilesPerGallon(){
        return this.milesPerGallon;
    }

    public FourWheeledVehicle(){
        super();
        this.model = "Unknown";
        this.doorCount = 0;
        this.milesPerGallon = 0.00D;
    }

    public FourWheeledVehicle(String manufacturer, String model, int seatCount, int wheelCount, int doorCount, double milesPerGallon){
        super(manufacturer, seatCount, wheelCount);
        this.model = model;
        this.doorCount = doorCount;
        this.milesPerGallon = milesPerGallon;
    }
}
