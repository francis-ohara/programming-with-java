package _6_abstract_classes._1shapes;

public abstract class Shape {
    //name, reference;
    //abstract: draw(), area(), perimeter()

    protected String name;
    protected Point reference;

    public abstract void draw();
    public abstract double area();
    public abstract double perimeter();

    public Shape(){
        this.name = "Unknown";
        this.reference = new Point(0,0);
    }

    public Shape(String name, Point reference){
        this.name = name;
        this.reference = reference;
    }
}
