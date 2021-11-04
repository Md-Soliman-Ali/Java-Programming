package oop;

public class Polymorphism_Overriding {

    public static void main(String[] args) {

        MyAnimal animal = new MyAnimal();
        animal.talk();

        MyAnimal human = new Human();
        human.talk();
    }
}

class MyAnimal {
    public void talk() {
        System.out.println("Animal Can't Talk");
    }
}

class Human extends MyAnimal {
    public void talk() {
        System.out.println("Human Can Talk");
    }
}

