package CSE111.Lab.Week10;

abstract class Animal {
    private String name;
    Animal(String name){
        this.name = name;
    }

    protected String getName(){
        return this.name;
    };
    abstract void makeNoise();
}

class Cat extends Animal {
    final String noise = "Meow!";
    public Cat(String name){
        super(name);
    }

    public void makeNoise(){
        System.out.println(super.getName() + " says " + this.noise);
    }
}

class Dog extends Animal {
    final String noise = "Woof woof!";
    public Dog(String name){
        super(name);
    }

    public void makeNoise(){
        System.out.println(super.getName() + " says " + this.noise);
    }
}

public class Q01 {
    public static void main(String[] args) {
        Animal a1 = new Cat("Tom"),
                a2 = new Dog("Spike");
        a2.makeNoise();

    }
}
