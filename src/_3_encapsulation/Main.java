package _3_encapsulation;

public class Main {
    public static void main(String[] args) {
        /*// instantiating an object of a class
        // Student ==> class
        // jasmine ==> object / instance
        // Student() ==> default constructor
        Student jasmine = new Student();
        Student Bervelyn = new Student("Bervelyn", "Shemale", "Computer Science");*/
        /*//Rectangle class
        Rectangle rectangle = new Rectangle();
        rectangle.setBreadth(30.00);
        rectangle.setLength(50.00);
        System.out.println("The length is " + rectangle.getLength());
        System.out.println("The breadth is " + rectangle.getBreadth());*/
        //Vector class
        Vector v1 = new Vector(42, 42);
        Vector v2 = new Vector(50, 50);

        v1.add(v2);

        System.out.println(v1.getX());
        System.out.println(v1.getY());

    }
}
/* Assignment
 * Implement the ff.
 * 1. Employee
 * 2. Stack
 * 3. Square
 * 4. Circle
 * 5. Car
 * 6. Bank Account
 *
 * */


/*
    * Class
    * Object
    * Diff. between class, object
    * Constructor
    * Instantiate an object
    * Getters & Setters
    * Default constructor
    * this
    *
 * stack
 * Box
 * Square
 * Employee
 * */

// Next week - static, Inheritance, Interfaces, Abstract classes.