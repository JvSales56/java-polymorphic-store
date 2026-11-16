import java.util.Scanner;

public class Store {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();

        int option;

        System.out.println("=======================================");
        System.out.println("       WELCOME TO OUR STORE!");
        System.out.println("=======================================");

        do {

            displayMenu();

            option = readInteger(scanner, "Choose a product (0 to finish): ");

            if (option == 0) {
                break;
            }

            Product selectedProduct = selectProduct(option);

            if (selectedProduct == null) {
                System.out.println("Invalid product option. Please try again.");
                continue;
            }

            int quantity = readInteger(scanner, "Enter the quantity: ");

            if (quantity <= 0) {
                System.out.println("Invalid quantity. Please enter a positive number.");
                continue;
            }

            for (int i = 0; i < quantity; i++) {
                cart.addProduct(selectedProduct);
            }

            System.out.println(
                    quantity + " x " + selectedProduct.getName()
                            + " added to your shopping cart."
            );

        } while (true);

        cart.displaySummary();

        System.out.println("\nThank you for shopping with us!");

        scanner.close();
    }

    private static void displayMenu() {

        System.out.println("\n========== PRODUCT MENU ==========");
        System.out.println("1 - Television     | $2500.00");
        System.out.println("2 - Radio          | $250.00");
        System.out.println("3 - Video Game     | $3000.00");
        System.out.println("4 - Tablet         | $1500.00");
        System.out.println("5 - Cell Phone     | $2000.00");
        System.out.println("0 - Finish Purchase");
        System.out.println("==================================");
    }

    private static Product selectProduct(int option) {

        switch (option) {
            case 1:
                return new Television();

            case 2:
                return new Radio();

            case 3:
                return new VideoGame();

            case 4:
                return new Tablet();

            case 5:
                return new CellPhone();

            default:
                return null;
        }
    }

    private static int readInteger(Scanner scanner, String message) {

        int value;

        while (true) {

            System.out.print(message);

            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine();
                return value;
            }

            System.out.println("Invalid input. Please enter a valid number.");
            scanner.nextLine();
        }
    }
}