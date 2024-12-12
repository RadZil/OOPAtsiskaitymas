public class Clothing extends Product {
    private int size;

    public Clothing(String productName, double price, String category, Integer stock) {
        super(productName, price, category, stock);
    }

    public void getSizeDetails(){
        System.out.println("Size:"+this.size);
    }

    public int getSize() {
        return size;
    }

}
