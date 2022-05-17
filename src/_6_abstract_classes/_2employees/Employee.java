package _6_abstract_classes._2employees;

public abstract class Employee {
    protected String name;


    public Employee(){
        this.name = "Unknown";
    }

    public Employee(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public abstract double pay();
}
