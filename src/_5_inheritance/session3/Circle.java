package _5_inheritance.session3;

public class Circle extends Shape{
    private double radius;
    private double circumference;

    public Circle(){
        this.radius = 0.0;
        this.circumference = 0;
    }

    public Circle(double radius){
        this.radius = radius;
        this.setCircumference();
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String draw(){
        return String.format("Imagine drawing a circle of radius %f units.", this.radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.setCircumference();
    }

    public double getRadius() {
        return this.radius;
    }

    public void setCircumference() {
        this.circumference = 2 * Math.PI * this.radius;
    }

    public double getCircumference(){
        return this.circumference;
    }

    //radius
    //circumference, overrides area, overrides draw
}
