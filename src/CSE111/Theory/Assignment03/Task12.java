package CSE111.Theory.Assignment03;

class Cat{
    
    public String color = "White";
    public String action = "sitting";
    
    public Cat(){
        
    }
    
    public Cat(String color){
        this.color = color;
    }

    public Cat(String color, String action){
        this.color = color;
        this.action = action;
    }

    public void printCat() {
        System.out.printf("%s cat is %s\n",this.color,this.action);
    }

    public void changeColor(String color) {
        this.color = color;
    }
}
public class Task12{
    public static void main(String [] args){

        Cat c1 = new Cat();
        Cat c2 = new Cat("Black");
        Cat c3 = new Cat("Brown","jumping");
        Cat c4 = new Cat("Red", "purring");

        c1.printCat();
        c2.printCat();
        c3.printCat();
        c4.printCat();

        c1.changeColor("Blue");
        c3.changeColor("Purple");

        c1.printCat();
        c3.printCat();
    }
}