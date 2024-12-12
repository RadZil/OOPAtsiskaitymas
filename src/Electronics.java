import java.sql.Time;

class Electronics extends Product{

    private int warrantyPeriod;

    public Electronics(String productName, double price, String category, Integer stock) {
        super(productName, price, category, stock);
    }

    public void checkWarranty(){
        System.out.println("Warranty:"+this.warrantyPeriod);
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

}
