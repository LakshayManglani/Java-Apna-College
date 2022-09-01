package _VQ;

public class _VQ_03_Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();

        shark.eat();
        shark.swim();

    }
}

// Base Or Parent
class Animal {
    String color;

    void eat() {
        System.out.println("Eat");
    }

    void breathe() {
        System.out.println("Breathe");
    }
}

// Derived Or Child
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swimes in Water");
    }
}