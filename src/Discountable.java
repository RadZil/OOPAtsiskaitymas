public interface Discountable {

    default void applyDiscount(double price){

    }

    default void applyBulkDiscount(int stock,double price){

    }
}
