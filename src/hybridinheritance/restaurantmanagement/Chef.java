package hybridinheritance.restaurantmanagement;

public class Chef extends Person implements Worker{

    public Chef(String name , int id){
        super(name, id);
    }

    //implementation of the perform duties
    @Override
    public void performDuties(){
        System.out.println("Chef : " + name + " is prepearing meal..");

    }

}
