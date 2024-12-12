import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("Antanas","Antanas@Email");
        Customer c2 = new Customer("Jurga", "Jurga@Email");

        Product telefonas = new Electronics("Telefonas", 111.12,"Electronics",18);
        Product maike = new Clothing("Maike", 9.99,"Drabuziai",12);
        Product maike2 = new Clothing("Xl Maike", 99.99,"Drabuziai",12);
        Product maike3 = new Clothing("XXXXL Maike", 999.99,"Drabuziai",12);
        ArrayList<Customer> klientai = new ArrayList<>();
        LinkedList<Product> produktai = new LinkedList<>();
        klientai.add(c1);klientai.add(c2);
        produktai.add(telefonas);produktai.add(maike);
        StoreManager manager = new StoreManager(produktai,klientai);

        System.out.println(manager.getProducts().toString());
        manager.generateReport();
        ///Order 1,2
        OrderItem orderItems1 = new OrderItem(telefonas,3);

        OrderItem orderItems2 = new OrderItem(maike,10);


        LinkedList<OrderItem> linkedOrder= new LinkedList<OrderItem>();
        linkedOrder.add(orderItems1);linkedOrder.add(orderItems2);
        Order order1 = new Order(1,linkedOrder);

        System.out.println("1st order content:" + order1);



        c1.placeOrder(order1);
        manager.generateReport();
        System.out.println("Applying discount for item1:"+telefonas.getProductName() + "Old price" + telefonas.getPrice());
        telefonas.applyDiscount(100);
        manager.generateReport();






    }
}