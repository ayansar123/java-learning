class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    public Dog() {
        super();
    }

    void bark() {
        System.out.println(name + " says Woof");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy");
        d.eat();
        d.bark();
    }
}