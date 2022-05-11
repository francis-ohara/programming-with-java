package _1_java_fundamentals.session1;


public class Main {

    public static void main(String[] args) {
       /*//question 1 - Write java code to print I will be serious this semester
        System.out.println("I will be serious this semester.");*/
/*        //question 2 - Write a program that accepts two integer inputs from the keyboard and performs the following
//    addition
//    subtraction
//    multiplication
//    division first number / second number
//        explain your answer
//        correct if necessary
//    first number raised to second number
//    square root of sum of first and second number

        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter number 1:");
        num1 = Integer.parseInt(input.next());
        System.out.println("Enter number 2:");
        num2 = Integer.parseInt(input.next());

        //i
        int sum = num1 + num2;
        System.out.printf("The sum of %d and %d is %d.\n",num1,num2,sum);

        //ii
        int difference = num1 - num2;
        System.out.printf("The difference between %d and %d is %d.\n",num1, num2, difference);

        //iii
        int product = num1 * num2;
        System.out.printf("The product of %d and %d is %d.\n",num1, num2, product);

        //iv
        double quotient = num1/(double) num2;
        System.out.printf("The quotient of %d and %d is %f.\n", num1, num2, quotient);

        //v
        int power = (int) Math.pow(num1,num2);
        System.out.printf("The power of %d and %d is %d.\n", num1, num2, power);

        //vi
        double root = Math.pow(num1+num2, 0.5); //or Math.sqrt
        System.out.printf("The square root of the sum of %d and %d is %.2f.\n", num1, num2, root);*/
        /*//question 3
        //Accepts two numbers; prints which is greater or if both are equal;
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        System.out.println("Enter first number:");
        firstNumber = Integer.parseInt(input.next());
        System.out.println("Enter second number:");
        secondNumber = Integer.parseInt(input.next());

        if (firstNumber > secondNumber) {
            System.out.printf("%d is greater than %d.", firstNumber, secondNumber);
        } else if (secondNumber > firstNumber) {
            System.out.printf("%d is greater than %d.", secondNumber, firstNumber);
        } else System.out.println("Both numbers are equal.");*/
         /*//Question 4
        int start, stop, step;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter start integer:");
        start = input.nextInt();
        System.out.println("Enter stop integer:");
        stop = input.nextInt();
        System.out.println("Enter step integer:");
        step = input.nextInt();

        for(int i=start; i<stop ; i+=step){
            System.out.print(i + " ");
        }

        System.out.println();

        while(start<stop){
            System.out.print(start + " ");
            start+=step;
        }*/
        /*//Question 5 - ask the user to enter specified number of integers; Find ratio of +ive integers to -ive integers
        Scanner input = new Scanner(System.in);
        int nPositive = 0;
        int nNegative = 0;
        int number;
        System.out.println("You are about to enter 10 integers.");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter number %d:\t", i + 1);
            number = input.nextInt();
            if (number > 0) nPositive++;
            else if(number<0) nNegative++;
        }
        double ratio = nNegative / (double) nPositive;
        System.out.printf("The ratio is %f.", ratio);*/
    /*   //Question 6 - Ask the user for an integer; sum the digits in the number; eg. 56 == 11
    Scanner input = new Scanner(System.in);
    int number;
    int sum=0;
    System.out.println("Enter a number:");
    number = input.nextInt();
    while(number>0){
        sum += number%10;
        number = number /10;
    }
    System.out.printf("The result is %d.", sum);
*/
    }
}
/*
        ASSIGNMENT - by Monday 8:00pm
        1. Implement the ff. Algorithms
            i. linear search
            ii. Binary search
            iii. Insertion sort
            iv. Selection sort
            v. Merge sort
        2. Hackerrank (Java)
            i. Welcome to Java
            ii. Java stdin and stdout
            iii. Java if-else
            iv. Java stdin and stdout II
            v. Java output formatting
            vi. Java loops I
            vii. Java loops II
            viii. Java Datatypes
            ix. Java 1D array
            x. Java 2D array
        3. Implement the ff. functions using recursion
            i. pow
            ii. fibonacci
            iii. binary search
            iv. factorial
*/
