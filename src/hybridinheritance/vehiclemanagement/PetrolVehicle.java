package hybridinheritance.vehiclemanagement;

public class PetrolVehicle extends Vehicle implements Refuelable{
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Implementation of refuel()
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle: " + model);
    }
}
