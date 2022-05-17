package _6_abstract_classes._1shapes;

public class Square extends Shape{
    private double length;

    @Override
    public void draw(){
        System.out.printf("Imagine drawing a square of length %f.\n",this.length);
    }

    @Override
    public double area(){
        return this.length * this.length;
    }

    @Override
    public double perimeter(){
        return 4 * this.length;
    }

    public Square(){
        this.length = 0;
    }

    public Square(double length){
        this.length = length;
    }

    public double getLength(){
        return this.length;
    }

    public void setLength(double length){
        this.length = length;
    }
}
