package assistedproblems.vehicle.and.transport.system;

public class Vehicle {
    public String name;
    public int maxSpeed;
    public String fuelType;

    public Vehicle(String name ,int maxSpeed,String fuelType){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    //display method
    public void displayInfo(){
        System.out.println("Vehicle details :");
        System.out.println("Name : " + name);
        System.out.println("maxSpeed : " + maxSpeed);
        System.out.println("FuelType :" + fuelType);
    }
}
