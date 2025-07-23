package Generics;

 
interface Category {}

 
class BookCategory implements Category {}
class ClothingCategory implements Category {}
class GadgetCategory implements Category {}

 
class Product<T extends Category> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String toString() {
        return name + " - ₹" + price;
    }
}

class DiscountUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        product.price -= product.price * percent / 100;
    }
}

 
public class OnlineMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Basics", 500, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 800, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 15000, new GadgetCategory());

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 15);
        DiscountUtil.applyDiscount(phone, 5);

        System.out.println("After Discount:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);
    }
}
