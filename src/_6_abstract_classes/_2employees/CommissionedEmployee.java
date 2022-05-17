package _6_abstract_classes._2employees;

public class CommissionedEmployee extends Employee {
    protected double rate;
    protected double price;
    protected int number;

    public CommissionedEmployee(){
        this.rate = 0.0;
        this.price = 0.0;
        this.number = 0;
    }

    public CommissionedEmployee(double rate, double price, int number){
        this.rate = rate;
        this.price = price;
        this.number = number;
    }

    public void setRate(double rate){
        this.rate = rate;
    }

    public double getRate(){
        return this.rate;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }
    @Override
    public double pay(){
        return this.price * this.number * this.rate;
    }
}
