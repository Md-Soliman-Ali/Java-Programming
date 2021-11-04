package oop;

public class Polymorphism_Overloading {

    public static void main(String[] args) {

        Salary salary = new Salary();
        //int totalSalary = salary.getSalary(8);
        int totalSalary = salary.getSalary(8, 2);
        System.out.println(totalSalary);
    }
}

class Salary {
    public int getSalary(int hour) {
        return hour * 500;
    }

    public int getSalary(int hour, int overtime) {
        return hour * 500 + overtime * 700;
    }
}
