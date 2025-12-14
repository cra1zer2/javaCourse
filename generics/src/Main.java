import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Box<String> box = new Box<>();
//        box.setItem("banana");
//        System.out.println(box.getItem());
        Product<String, Float, Integer> products = new Product<>();
        products.setItem("Apple");
        products.setPrice(2.99f);
        products.setQuantity(10);


        System.out.println("Products:");
        System.out.println("Name: " + products.getItem());
        System.out.println("Price: " + products.getPrice());
        System.out.println("Quantity: " + products.getQuantity());
    }
}
