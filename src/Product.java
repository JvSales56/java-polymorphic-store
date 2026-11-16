public abstract class Product {

    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public final String getName() {
        return name;
    }

    public final double getPrice() {
        return price;
    }

    public abstract String getCategory();
}