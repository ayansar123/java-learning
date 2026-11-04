class Pet {
    void eat() {
        System.out.println("Pet eats food");
    }

    void sound() {
        System.out.println("Some sound");
    }
}

class Horse extends Pet {
    @Override
    void sound() {
        System.out.println("Neigh");
    }
}

class Cow extends Pet {
    @Override
    void sound() {
        System.out.println("Moo");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Pet a1 = new Horse();
        Pet a2 = new Cow();

        a1.eat();
        a2.eat();

        a1.sound();
        a2.sound();
    }
}