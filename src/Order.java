import java.util.LinkedList;

public class Order {
    private int orderId;
    private LinkedList<OrderItem> orderItems;

    public Order(int orderId,LinkedList<OrderItem> orderItems) {
        this.orderId = orderId;
        this.orderItems = orderItems;
    }

    public void addProduct(Product product, int quantity){

        OrderItem newOrder = new OrderItem(product,quantity);

        orderItems.add(newOrder);
    }

    public double calculateTotal(){
        double subtotal = 0;
        for (int i = 0; i < orderItems.size(); i++) {
            subtotal += orderItems.get(i).getSubtotal();

        }
        return subtotal;
    }


    public void applyDiscount(){
//        for (int i = 0; i < orderItems.size(); i++) {
//            OrderItem orderis = orderItems.get(i);
//            for (int j = 0; j < ; j++) {
//                order
//            }
//        }
    }

    public int getOrderId() {
        return orderId;
    }

    public LinkedList<OrderItem> getOrderItems() {
        return orderItems;
    }

    @Override
    public String toString() {
        return "Order id: "+this.orderId +
                " "+ this.orderItems + "Total Price: " + calculateTotal();
    }
}
