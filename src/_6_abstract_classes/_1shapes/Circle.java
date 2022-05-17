package _6_abstract_classes._1shapes;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    public void draw(){
        System.out.printf("Imagine drawing a circle of radius %f units.\n", this.radius);
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * this.radius;
    }
}
