package multilevelinheritance.onlineretailmanagement;

public class OnlineRtailOrderManagement {
    public static void main(String[] args){
        Order o1 = new ShippedOrder(101,12,200);
        ShippedOrder s1 = new DeliveredOrder(102,12,200,20);
        o1.getOrderStatus();
        s1.getOrderStatus();
    }
}
