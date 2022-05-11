package _4_inheritance.session2;

public class Circle extends Shape{
    double radius;
    double centerX;
    double centerY;


    public Circle(){
        this.setName();
        this.radius = 1;
        this.centerX = 0;
        this.centerY = 0;
    }

    public Circle(double radius){
        this.setName();
        this.centerX = 0;
        this.centerY = 0;
        this.radius = radius;
    }

    public Circle(double radius, double centerX, double centerY){
        this.setName();
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    @Override
    public String toString(){
        return String.format("Circle with center (%f, %f) and radius %f units.", this.centerX, this.centerY, this.radius);
    }

    private void setName(){
        this.name = "Circle";
    }

    @Override
    public String getName(){
        return this.name;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double[] getCenter(){
        return new double[] {this.centerX, this.centerY};
    }



}
