package hybridinheritance.vehiclemanagement;

public class VehicleManagementSystem {
    public static void main(String[] args){

        PetrolVehicle p1 = new PetrolVehicle(101,"Toyota");
        ElectronicVehicle e1 = new ElectronicVehicle(102,"Telsa Model");

        //call method
        System.out.println("Petrol Vehicle :");
        System.out.println("Model :" + p1.model);
        System.out.println("Max Speed :" + p1.maxSpeed);
        p1.refuel();

        System.out.println("Electrical vehicle :");
        System.out.println("Model :" + e1.model);
        System.out.println("Max Speed :" + e1.maxSpeed);
        e1.refuel();






    }
}
