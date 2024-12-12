import java.util.LinkedList;

public class Customer {
    private String name;
    private String email;
    private LinkedList<Order> orderHistory;

    public Customer(String name, String email){
        this.name = name;
        this.email = email;
        this.orderHistory = new LinkedList<Order>();
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public LinkedList<Order> getOrderHistory() {
        return orderHistory;
    }

    public void placeOrder(Order order){
        orderHistory.add(order);
        System.out.printf("Placed an order for: "+this.name);
    }
    public void getOrderStatistics(){
        for (int i = 0; i < orderHistory.size(); i++) {
            Order currentOrder = orderHistory.get(i);

            System.out.println("Order id:" + currentOrder.getOrderId()+
                    " {" + currentOrder.getOrderItems().toString() + "}" + "Total: " + currentOrder.calculateTotal()
            );
        }
    }
}

