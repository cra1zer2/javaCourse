public class Product<T, U, V> {
    T item;
    U price;
    V quantity;
    public Product() {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    public T getItem() {
        return item;
    }

    public U getPrice() {
        return price;
    }

    public V getQuantity() {
        return quantity;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void setPrice(U price) {
        this.price = price;
    }

    public void setQuantity(V quantity) {
        this.quantity = quantity;
    }
}
