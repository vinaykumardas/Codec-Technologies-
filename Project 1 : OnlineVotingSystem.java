import java.util.ArrayList;
import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Product> cart = new ArrayList<>();

        products.add(new Product(1, "Laptop", 50000));
        products.add(new Product(2, "Mobile", 20000));
        products.add(new Product(3, "Headphones", 2000));

        while (true) {
            System.out.println("\n--- E-Commerce Menu ---");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Product Catalog:");
                    for (Product p : products) {
                        System.out.println(p.id + " - " + p.name + " - Rs." + p.price);
                    }
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    for (Product p : products) {
                        if (p.id == id) {
                            cart.add(p);
                            System.out.println(p.name + " added to cart.");
                        }
                    }
                    break;

                case 3:
                    double total = 0;
                    System.out.println("Cart Items:");
                    for (Product p : cart) {
                        System.out.println(p.name + " - Rs." + p.price);
                        total += p.price;
                    }
                    System.out.println("Total: Rs." + total);
                    break;

                case 4:
                    total = 0;
                    for (Product p : cart) {
                        total += p.price;
                    }
                    System.out.println("Total Amount: Rs." + total);
                    System.out.println("Payment Successful!");
                    cart.clear();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
