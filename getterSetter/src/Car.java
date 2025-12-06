public class Car {

    private final String model;
    // final means const (can't be changed)
    private String color;
    private int price;

    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel() {
        return model;
    }
    String getColor() {
        return color;
    }
    String getPrice() {
        return price + "$";
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price cannot be negative");
        }
        else  {
            this.price = price;
        }
    }

}
