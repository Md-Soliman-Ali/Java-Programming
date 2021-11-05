package oop;

public class Encapsulation {

    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        shirt.getPrice();
    }
}

class Dress {
    private String brand;
    private String color;
    private String size;

    /*public String brand;
    public String color;
    public String size;*/
}

class Shirt extends Dress {
    public void getPrice() {
        System.out.println("The Price Of This Shirt Is 100 Tk Only");
    }
}
