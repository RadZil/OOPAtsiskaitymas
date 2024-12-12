import java.util.ArrayList;
import java.util.LinkedList;

public class StoreManager {
    private LinkedList<Product> products;
    private ArrayList<Customer> customers;



    public StoreManager(LinkedList<Product> produktai, ArrayList<Customer> klientai) {
        this.customers = klientai;
        this.products = produktai;
    }




    public void generateReport(){
        System.out.println("\nStore report:");
        System.out.println("Item:");
        for (Product i:products){
            System.out.println(i);
        }

        System.out.println("Customers:");
        for (Customer i:customers){
            i.getOrderStatistics();
        }

        System.out.println("Items in the from 99 - 1000 range");
        ProductFilters filtras = new ProductFilters();

        System.out.println(filtras.filterByPrice(products,99,1000));

        System.out.println("Items in electronics");
        System.out.println(filtras.filterByCategory(products,"Elektronics"));


    }
    public void removeOutOfStock(){
        for (Product i : products) {
            if (i.getStock() <= 0){
                System.out.println("Removing product: " + i.getProductName() + "Out of stock");
                products.remove(i);
            }
        }
    }

    public LinkedList<Product> getProducts() {
        return products;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
