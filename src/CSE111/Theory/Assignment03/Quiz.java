package CSE111.Theory.Assignment03;

class Dog {
    private String color = "Black";

    public Dog(String color) {
        this.color = color;
    }

    public void bark() {
        System.out.printf("%s dog is barking\n",this.color);
    }

    public void changeColor(String color){
        this.color= color;
    }
}
public class Quiz {
    public static void main (String[] args){
        Dog odie = new Dog("Red");
        Dog goofy = new Dog("Blue");
        odie.bark();
        goofy.bark();
        odie.changeColor("Brown");
        odie.bark();
    }
}