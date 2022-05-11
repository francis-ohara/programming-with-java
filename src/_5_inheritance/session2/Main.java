package _5_inheritance.session2;

public class Main {
    public static void main(String[] args) {
        //implement a Vehicle class
        Vehicle vehicle = new Vehicle();
        Vehicle vehicle1 = new Vehicle("VW", 9);
        LandVehicle vehicle2 = new LandVehicle(
                "Mercedes",
                4,
                4
        );
        FourWheeledVehicle vehicle3 = new FourWheeledVehicle(
                "Toyota",
                "Prius",
                4,
                4,
                4,
                52.0

        );
        Truck vehicle4 = new Truck();
        vehicle4.move("Kasoa");


    }
}
