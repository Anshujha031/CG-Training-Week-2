package assistedproblems.vehicle.and.transport.system;

public class Truck extends Vehicle{
    public int luggageCapacityInKg;

    public Truck(String name ,int maxSpeed ,String fuelType ,int luggageCapacityInKg){
        super(name ,maxSpeed,fuelType);
        this.luggageCapacityInKg = luggageCapacityInKg;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("luggage Capacity In Kg : " + luggageCapacityInKg);

    }

}
