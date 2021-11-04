package oop;

public class Inheritance {
    public static void main(String[] args) {
        Animal tiger = new Animal();
        tiger.talk();
        tiger.breeds("Tiger");

        /*Fish fish = new Fish();
        fish.talk();
        fish.breeds("Hilsa");*/
    }
}

class Animal {
    public void talk() {
        System.out.println("Animal Can't Talk");
    }

    public void breeds(String animal) {
        System.out.println(animal + " Gives Birth " + animal);
    }
}

class Fish extends Animal {

}