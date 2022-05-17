package _6_abstract_classes._2employees;

public class Main {
    public static void main(String[] args){
        Employee employee1 = new HourlyEmployee(0.75,56);
        System.out.println(employee1.pay());
    }
}
