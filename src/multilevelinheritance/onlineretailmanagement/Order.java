package multilevelinheritance.onlineretailmanagement;

public class Order {
    public int orderId;
    public int orderDate;

    public Order(int orderId , int orderDate)
    {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void getOrderStatus(){
        System.out.println("order id : " + orderId);
        System.out.println("order date : " + orderDate);
    }
}
