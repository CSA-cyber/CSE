package CSE111.Lab.Week10;

abstract class Instrument {
    protected String name;

    Instrument(String name){
        this.name = name;
    }

    abstract void play();
    abstract void adjust();
    protected void compose() {

    }
}

class Guitar extends Instrument {
    public Guitar(){
        super("Guitar");
    }
    public void play(){
        System.out.printf("Playing %s\n", super.name);
    }

    public void adjust() {
        System.out.printf("Adjusting %s\n", super.name);
    }
}

class Keyboard extends Instrument {
    public Keyboard(){
        super("Keyboard");
    }
    public void play(){
        System.out.printf("Playing %s\n", super.name);
    }

    public void adjust() {
        System.out.printf("Adjusting %s\n", super.name);
    }
}

class Violin extends Instrument {
    public Violin(){
        super("Violin");
    }
    public void play(){
        System.out.printf("Playing %s\n", super.name);
    }

    public void adjust() {
        System.out.printf("Adjusting %s\n", super.name);
    }
}

public class T08 {
    public static void main(String[] args) {

    }
}
