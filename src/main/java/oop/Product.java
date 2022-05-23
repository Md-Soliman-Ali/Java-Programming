package oop;

// Parameterised Constructor
public class Product {

    public int vat;

    public Product(int vat) {
        this.vat = vat;
    }

    public static void main(String[] args) {
        Product product = new Product(15);
        int price = product.price(100);
        System.out.println("Price with 15% Vat: " + price + " Taka Only");
    }

    public int price(int price) {
        int totalPrice = price + (price * 15 / 100);
        return totalPrice;
    }
}
