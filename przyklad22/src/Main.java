interface Animal {
    void eat();
}

interface Mammal extends Animal {
    void breath();
}

interface Nameable {
    String getName();
}

abstract class Pet implements Mammal, Nameable {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void breath() {
        System.out.println(name + " is breathing");
    }

    public abstract void voice();

    public String getName() {
        return name;
    }
}

class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Bark");
    }
}

class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Miau");
    }
}

public class Main {

    public static void main(String[] args) {
        Dog arnold = new Dog("Arnold");
        arnold.breath();
        System.out.print(arnold.getName() + " says ");
        arnold.voice();

        Mammal antonio = new Dog("Antonio");
        antonio.breath();
        antonio.eat();
        //antonio.voice - will not work because antonio is Mammal and Mammal has no method voice()

        Cat tom = new Cat("Tom");
        System.out.print(tom.getName() + " says ");
        tom.voice();
        tom.breath();
        tom.eat();
    }
}
