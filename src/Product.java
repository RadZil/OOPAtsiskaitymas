public abstract class Product implements Discountable {

    private String productName;
    private double price;
    private String category;
    private Integer stock;

    public Product(String productName,double price,String category,Integer stock){
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCategory() {
        return category;
    }

    public String getProductName() {
        return productName;
    }


    @Override
    public void applyDiscount(double price) {
        this.price = this.price - price;
    }

    @Override
    public void applyBulkDiscount(int stock, double price) {
        Discountable.super.applyBulkDiscount(stock, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", stock=" + stock +
                '}';
    }
}
