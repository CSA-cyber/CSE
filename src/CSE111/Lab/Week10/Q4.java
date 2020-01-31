package CSE111.Lab.Week10;

abstract class Shape {
    protected String shapeName;

    Shape(String name) {
        this.shapeName = name;
    }

    protected abstract void area();

    public String toString(){
        return this.shapeName;
    }
}

class Sphere extends Shape {
    private double radius, area;

    public Sphere(double radius){
        super("Sphere");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        setArea(radius);
    }

    public void area(){
        System.out.println(this.area);
    }

    private void setArea(double radius) {
        this.area = 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle extends Shape {
    private double radius, area;

    public Rectangle(double radius){
        super("Rectangle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        setArea(radius);
    }

    public void area(){
        System.out.println(this.area);
    }

    private void setArea(double radius) {
        this.area = 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Cylinder {

}

public class Q4 {
    public static void main(String[] args) {

    }
}
