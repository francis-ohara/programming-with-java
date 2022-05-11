package _4_inheritance.session2;

public class Shape {
    protected String name;

    public Shape(){
        this.name = "Unknown Shape";
    }
    public Shape(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
