import java.util.Arrays;

public class ShoppingCart {

    private Product[] products;
    private int count;

    public ShoppingCart() {
        products = new Product[10];
        count = 0;
    }

    public void addProduct(Product product) {

        if (count == products.length) {
            products = Arrays.copyOf(products, products.length * 2);
        }

        products[count] = product;
        count++;
    }

    public void displaySummary() {

        if (count == 0) {
            System.out.println("\nYour shopping cart is empty.");
            return;
        }

        boolean[] displayed = new boolean[count];
        double total = 0;

        System.out.println("\n========== PURCHASE SUMMARY ==========");

        for (int i = 0; i < count; i++) {

            if (!displayed[i]) {

                Product currentProduct = products[i];
                int quantity = 0;

                for (int j = i; j < count; j++) {

                    if (products[j].getCategory()
                            .equals(currentProduct.getCategory())) {

                        quantity++;
                        displayed[j] = true;
                    }
                }

                double subtotal = currentProduct.getPrice() * quantity;

                System.out.printf(
                        "%-15s | Quantity: %d | Unit Price: $%.2f | Subtotal: $%.2f%n",
                        currentProduct.getName(),
                        quantity,
                        currentProduct.getPrice(),
                        subtotal
                );

                total += subtotal;
            }
        }

        System.out.println("---------------------------------------");
        System.out.printf("Total Items: %d%n", count);
        System.out.printf("Final Price: $%.2f%n", total);
        System.out.println("=======================================");
    }
}