//QUESTION 1
//linear search
package _1_java_fundamentals.assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int position = -1;
        int target;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter target number:");
        target = input.nextInt();
        input.close();

        System.out.println("------Searching------");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                position = i;
                break;
            }
        }

        if (position != -1)
            System.out.printf("Target found at position %s.\n", position);
        else
            System.out.println("Target not found.\n");


    }
}
/*//ii.binary search
package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] Args){
        int[] numbers = {64, -3, 2, 0, 48, 26, -13, 98, 54, 77};
        int position=-1;
        int start = 0;
        int end = numbers.length;
        int middle;
        int target;

        System.out.println("Unsorted Array: " + Arrays.toString(numbers));
        System.out.println("----Sorting----");
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter target number:");
        target = input.nextInt();
        input.close();

        while(start<end){
            middle = (start+end)/2;
            if(target == numbers[middle]){
                position = middle;
                break;
            }
            else if(target > numbers[middle])
                start = middle + 1;
            else
                end = middle - 1;
        }

        if (position != -1)
            System.out.println("Target found at position " + position);
        else
            System.out.println("Target not found.");
    }
}*/
/*//iii. Insertion sort
package com.company;

import java.util.Arrays;

public class Main{
    public static void main(String[] Args){
        int[] numbers = {-3, 4, 56, -7, 42, 18, 61, 9, 23, 14};
        int current;

        System.out.println("Unsorted Array: " + Arrays.toString(numbers));
        System.out.println("----Sorting----");

        for(int i = 1; i< numbers.length; i++){
            for(int j = i-1; j >= 0; j--){
                if (numbers[j] > numbers[j+1]){
                    current = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = current;
                }
                else break;
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}*/
/*//iv. selection sort
package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-3, 4, 56, -6, -7, 42, 18, 61, 9, 23, 14, 42};
        int current;

        System.out.println("Unsorted Array: "+ Arrays.toString(numbers));
        System.out.println("----Sorting----");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    current = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = current;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}*/
/*//v. Merge sort
package com.company;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] numbers = {-3, 4, 56, -6, -7, 42, 18, 61, 9, 23, 14, 42};

        System.out.println("Unsorted Array: " + Arrays.toString(numbers));

        System.out.println("----Sorting----");
        mergeSort(numbers, numbers.length);

        System.out.println("Sorted Array: " + Arrays.toString(numbers));

    }
     static void mergeSort(int[] array, int n) {
        if (n < 2) {
            return;
        }
        int middle = n / 2;
        int[] left = new int[middle];
        int[] right = new int[n - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }
        for (int i = middle; i < n; i++) {
            right[i - middle] = array[i];
        }
        mergeSort(left, middle);
        mergeSort(right, n - middle);

        merge(array, left, right, middle, n - middle);
    }
     static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}*/

//QUESTION 2
/*
//i. Welcome to Java
public class Solution {

    public static void main(String[] args) {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
}
*/
/* //ii. Java stdin and stdout
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        int number1, number2, number3;
        Scanner input = new Scanner(System.in);

        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    }
}
*/
/*//iii. Java if-else
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n%2==1)
            System.out.println("Weird");
        else if (n>=2 && n <= 5)
            System.out.println("Not Weird");
        else if (n>=6 && n <= 20)
            System.out.println("Weird");
        else
            System.out.println("Not Weird");
    }
}*/
/*//iv. Java stdin and stdout II
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        Scanner input = new Scanner(System.in);
        int numInt = input.nextInt();
        double numDouble = input.nextDouble();
        input.nextLine();
        String string = input.nextLine();

        System.out.println("String: " + string);
        System.out.println("Double: " + numDouble);
        System.out.println("Int: " + numInt);
    }
}*/
/*
//v. Java output formatting
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        Scanner input = new Scanner(System.in);
        String string;
        int number;

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            string = input.next();
            number = input.nextInt();
            System.out.printf("%-15s%03d\n", string, number);
        }

        System.out.println("================================");

    }
}
*/
/*
//vi. Java loops I
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        for(int i = 1; i<=10; i++)
            System.out.println(N + " x " + i + " = " + N*i);

    }
}
*/
/*//vii. Java loops II
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        int a, b, n, currentTerm, previousTerm;

        for(int i = 0; i < q; i++){
            a = input.nextInt();
            b = input.nextInt();
            n = input.nextInt();
            previousTerm = a;

            for(int j = 0; j < n; j++){
                currentTerm = previousTerm + ((int) Math.pow(2, j) * b);
                System.out.print(currentTerm + " ");
                previousTerm = currentTerm;
            }
            System.out.println();
        }


    }
}*/
/*//viii. Java Datatypes
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        String numberString = "";
        long number;

        for(int i=0; i< T;i++){
            try{
                numberString = input.next();
                number = Long.parseLong(numberString);
                System.out.println(numberString + " can be fitted in:");
                if(number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE)
                    System.out.println("* int");
                System.out.println("* long");

            } catch(NumberFormatException e) {
                System.out.println(numberString + " can't be fitted anywhere.");
            }

        }
    }
}*/
/*//ix. Java 1D array
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = input.nextInt();
        for(int number: a)
            System.out.println(number);
    }
}*/
/*//x. Java 2D array
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        int currentSum;
        int maximumSum = arr.get(0).get(0) + arr.get(0).get(1) + arr.get(0).get(2) + arr.get(1).get(1) + arr.get(2).get(0) + arr.get(2).get(1) + arr.get(2).get(2);


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                currentSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                if (currentSum > maximumSum)
                    maximumSum = currentSum;
            }
        }

        System.out.println(maximumSum);
    }
}*/

//QUESTION 3
/*//i.pow
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(power(5, 2));
    }

    static double power(double base, int exponent) {
        if (exponent == 0)
            return 1;
        else if (exponent == 1)
            return base * exponent;
        else
            return base * power(base, exponent-1);
    }
}*/
/*//ii. fibonacci
package com.company;

public class Main{
    public static void main(String[] args){
        System.out.println(fibonacci(5));
    }
    static int fibonacci(int n){
        if (n==0)
            return 1;
        else if (n==1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}*/
//iii. binary search
/*//iv. factorial
package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}*/

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
