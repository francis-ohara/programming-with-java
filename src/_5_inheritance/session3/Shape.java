package _5_inheritance.session3;

public class Shape {
    private String name;
    private Point reference;


    public Shape(){}

    public Shape(String name, Point reference){
        this.name = name;
        this.reference = reference;
    }

    //Getters and setters

    // Draw method
    public String draw(){ return "";}

    //Area method
    public double area(){return 0;}

}
