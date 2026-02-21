import java.io.*;
import java.util.*;

class InventoryManagementSystem {

    // Product class
    static class Product implements Serializable {
        private int id;
        private String name;
        private int quantity;
        private double price;

        public Product(int id, String name, int quantity, double price) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public double getTotalValue() {
            return quantity * price;
        }

        @Override
        public String toString() {
            return "ID: " + id +
                    ", Name: " + name +
                    ", Quantity: " + quantity +
                    ", Price: " + price;
        }
    }

    // Inventory list
    private static ArrayList<Product> productList = new ArrayList<>();
    private static final String FILE_NAME = "inventory.dat";

    // Save data to file
    private static void saveToFile() {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(productList);
        } catch (IOException e) {
            System.out.println("Error saving data.");
        }
    }

    // Load data from file
    @SuppressWarnings("unchecked")
    private static void loadFromFile() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            productList = (ArrayList<Product>) ois.readObject();
        } catch (Exception e) {
            productList = new ArrayList<>();
        }
    }

    // Add product
    private static void addProduct(Scanner sc) {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        productList.add(new Product(id, name, quantity, price));
        saveToFile();
        System.out.println("Product added successfully!");
    }

    // Display products
    private static void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        for (Product p : productList) {
            System.out.println(p);
        }
    }

    // Search product by ID
    private static void searchProduct(Scanner sc) {
        System.out.print("Enter Product ID to search: ");
        int id = sc.nextInt();

        for (Product p : productList) {
            if (p.getId() == id) {
                System.out.println("Product Found:");
                System.out.println(p);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Calculate total stock value
    private static void calculateTotalStockValue() {
        double total = 0;
        for (Product p : productList) {
            total += p.getTotalValue();
        }
        System.out.println("Total Inventory Stock Value: " + total);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        loadFromFile();

        int choice;

        do {
            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Calculate Total Stock Value");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addProduct(sc);
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    searchProduct(sc);
                    break;
                case 4:
                    calculateTotalStockValue();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
