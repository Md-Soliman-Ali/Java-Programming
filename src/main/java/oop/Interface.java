package oop;

public class Interface {

    public static void main(String[] args) {

        Child child = new Child();
        child.looksLike();
        child.behaviour();
    }
}

interface Father {
    void looksLike();
}

interface Mother {
    void behaviour();
}

class Child implements Father, Mother {
    public void looksLike() {
        System.out.println("Looking Like Father");
    }

    public void behaviour() {
        System.out.println("Behaviour Like Mother");
    }
}
