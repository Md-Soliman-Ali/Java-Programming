package oop;

public class Abstract {

    public static void main(String[] args) {

        Food biriani = new Biriani();
        biriani.cook();

        // Self Override
        Food food = new Food() {
            @Override
            void cook() {
                System.out.println("Animal Also Eat Food");
            }
        };
        food.cook();
    }
}

abstract class Food {
    abstract void cook();
}

class Biriani extends Food {
    public void cook() {
        System.out.println("Biriani is Cooking");
    }
}

class Khichuri extends Food {
    public void cook() {
        System.out.println("Khichuri is Cooking");
    }
}