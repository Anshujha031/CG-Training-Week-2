package assistedproblems.vehicle.and.transport.system;

public class VehicleManagement {
    public static void main(String[] args){

        Vehicle C = new Car( "Car" ,200 , "Petrol" , 5);
        Vehicle T = new Truck( "Truck" ,500,"Desiel" , 500);
        Vehicle M = new Motorcycle("MotorCycle" ,600,"Petrol");

        Vehicle[]  vehicle = {C , T , M};

        for(Vehicle v : vehicle){
            v.displayInfo();;
            System.out.println("------------------");
        }

    }
}
