package _6_abstract_classes._2employees;

public class HourlyEmployee extends Employee{
    private double hourlyRate;
    private double numberOfHours;


    public HourlyEmployee(){
        this.hourlyRate = 0.0;
        this.numberOfHours = 0.0;
    }

    public HourlyEmployee(double hourlyRate, double numberOfHours){
        this.hourlyRate = hourlyRate;
        this.numberOfHours =  numberOfHours;
    }

    public void setHourRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate(){
        return this.hourlyRate;
    }

    public void setNumberOfHours(double numberOfHours){
        this.numberOfHours = numberOfHours;
    }

    public double getNumberOfHours(){
        return this.numberOfHours;
    }

    @Override
    public double pay(){
        return this.hourlyRate * this.numberOfHours;
    }
}
