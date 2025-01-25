package hybridinheritance.vehiclemanagement;

public class ElectronicVehicle extends Vehicle implements Refuelable{

    public ElectronicVehicle(int maxSpeed,String model){
        super(maxSpeed, model);
    }

    @Override
    public void refuel(){
        System.out.println("Refueling the petrol : " + model);
    }
}
