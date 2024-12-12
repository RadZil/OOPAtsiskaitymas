import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class OrderItem {

    private Product product;
    private int quantity;
    public OrderItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
        int oldStock = product.getStock();
        product.setStock(oldStock-quantity);

    }

    public double getSubtotal(){


        return product.getPrice()*quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "\n{" + product +
                ", quantity=" + quantity +
                '}';
    }
}
