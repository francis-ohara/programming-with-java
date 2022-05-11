package _3_encapsulation;

public class Rectangle {
    private double length; //private to prevent negative value assignment
    private double breadth;
    private double area;

    public double getLength(){
        return this.length;
    }

    public double getBreadth(){
        return this.breadth;
    }

    public void setLength(double length) {
        if(length<0)
            length = Math.abs(length);
        this.length = length;
        this.area = length * this.breadth;
    }
    public void setBreadth(double breadth){
        if(breadth<0)
            breadth = Math.abs(breadth);
        this.breadth = breadth;
    }

    public Rectangle(){
        this.length = 1;
        this.breadth = 1;
        this.area = 1;
    }

    public Rectangle(double length, double breadth) {
        this.setLength(length);
        this.setBreadth(breadth);
        this.breadth = breadth;
        this.area = length * breadth;
    }

    public Rectangle(double side){
        if (side<0)
            side = Math.abs(side);
        this.setBreadth(side);
        this.setLength(side);
        this.area = side * side;
    }

}
