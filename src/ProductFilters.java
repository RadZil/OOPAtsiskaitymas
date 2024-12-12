import java.util.LinkedList;
import java.util.List;


public class ProductFilters {



    public ProductFilters(){}
    public LinkedList<Product> filterByCategory(LinkedList<Product> produktai, String kategorija){
        for (Product i:produktai ){
            if (i.getCategory() != kategorija){
                produktai.remove(i);
                System.out.println("Removing "+i);
            }
        }

        return produktai;
    }
    public LinkedList<Product> filterByPrice(LinkedList<Product> produktai, double min, double max){
        System.out.println("AAAAAAAAAAAAA"+produktai);
        for (Product i:produktai ){

            if (i.getPrice() < max && i.getPrice()>min){
                produktai.remove(i);
            }
        }

        return produktai;
    }
}
