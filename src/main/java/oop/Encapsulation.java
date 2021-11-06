package oop;

public class Encapsulation {

    public static void main(String[] args) {

        Shirt shirt = new Shirt();

        shirt.setBrand("Richman");
        shirt.setColor("Red");
        shirt.setSize("XL");

        System.out.println(shirt.getBrand());
        System.out.println(shirt.getColor());
        System.out.println(shirt.getSize());
        shirt.getPrice();

        TShirt tShirt = new TShirt();
        tShirt.setBrand("POLO");
        System.out.println(tShirt.getBrand());
        tShirt.getPrice();
    }
}

class Dress {
    private String brand;
    private String color;
    private String size;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

class Shirt extends Dress {
    public void getPrice() {
        System.out.println("The Price Of This Shirt Is 100 Tk Only");
    }
}

class TShirt extends Dress {
    public void getPrice() {
        System.out.println("The Price Of This Shirt Is 50 Tk Only");
    }
}
