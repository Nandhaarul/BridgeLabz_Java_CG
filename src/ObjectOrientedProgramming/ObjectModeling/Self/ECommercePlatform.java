package ObjectOrientedProgramming.ObjectModeling.Self;

import java.util.ArrayList;

class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void displayProduct() {
        System.out.println(productName + " - INR " + price);
    }
}

class Order {
    int orderId;
    ArrayList<Product> products = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            p.displayProduct();
        }
    }
}

class Customer {
    String name;
    ArrayList<Order> orders = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order.orderId);
    }

    void displayOrders() {
        System.out.println("Customer: " + name);
        for (Order o : orders) {
            o.displayOrderDetails();
        }
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 75000);
        Product p2 = new Product("Mouse", 1500);
        Product p3 = new Product("Keyboard", 3000);

        Order order1 = new Order(101);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(102);
        order2.addProduct(p3);

        Customer customer = new Customer("Nandha Arul");

        customer.placeOrder(order1);
        customer.placeOrder(order2);

        customer.displayOrders();
    }
}

