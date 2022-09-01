package _VQ;

public class _VQ_04_Abstraction {
    public static void main(String[] args) {
        System.out.println();
        Lion baga = new Lion();

        baga.eat();
        baga.walk();
        System.out.println(baga.skinColor);

        baga.changeColor("Red");
        System.out.println(baga.skinColor);
        System.out.println();
    }
}

abstract class WildAnimal {
    String skinColor;

    // In abstract class we use constructor as default for every Child of it.
    WildAnimal() {
        System.out.println("Here runs your WildAnimal Constructor");
        skinColor = "Brown";
    }

    void eat() {
        System.out.println("Eat");
    }

    abstract void walk();
}

class Lion extends WildAnimal {
    Lion() {
        System.out.println("Here runs your Lion Constructor");
    }

    void changeColor(String color) {
        this.skinColor = color;
    }

    @Override
    void walk() {
        System.out.println("Walks on 4 Legs");
    }
}

class Chicken extends WildAnimal {
    @Override
    void walk() {
        System.out.println("Walks on 2 Legs");
    }
}
