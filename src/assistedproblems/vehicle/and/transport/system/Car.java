package assistedproblems.vehicle.and.transport.system;

public class Car extends Vehicle{
    public int seatCapacity;
    public Car( String name ,int maxSpeed , String fuelType , int seatCapacity){
        super(name ,maxSpeed,fuelType);
        this.seatCapacity = seatCapacity;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity : " + seatCapacity);
    }


}
