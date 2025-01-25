package hybridinheritance.restaurantmanagement;

public class RestaurantManagementSystem {
    public static void main(String[] args){

       Chef c1 = new Chef("Rahul",101);
       Waiter w1 = new Waiter("Rohit",102);

        // Use polymorphism to call performDuties()
        Worker chefWorker = c1;
        Worker waiterWorker = w1;

        chefWorker.performDuties();
        System.out.println("Id : " + c1.id);
        waiterWorker.performDuties();
        System.out.println("Id : " + w1.id);




    }
}
