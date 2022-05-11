package _2_problem_solving;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //1. Binary search - Query an array; ask user for target; give position of target or -1;
        //complexity - O(logN)

        //Advice for getting into FAANG - learn data structures and algorithms religiously.

        int[] numbers = {3, 4, 5, 69, 42, 35, 67, 66, 87, 10};

        System.out.println("Unsorted Array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        int position = -1;
        int start = 0;
        int end = numbers.length - 1;
        int middle;
        int target;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter target number:");
        target = input.nextInt();

        while (start <= end) {
            middle = (start + end) / 2;
            if (target == numbers[middle]) {
                position = middle;
                break;
            } else if (target > numbers[middle])
                start = middle + 1;
            else
                end = middle - 1;
        }

        if (position != -1)
            System.out.printf("Target found at index %d.\n", position);
        else
            System.out.println("Target not found.");
        /*//2. Linear search
        // complexity - n
        Scanner input = new Scanner(System.in);
        int[] numbers = {2, 3, 1, 5, 6, 7, 8, 4, 2, 1};
        int target;
        int position = -1;

        System.out.println("Array :" + Arrays.toString(numbers));

        System.out.println("Enter target number:");
        target = input.nextInt();

        for(int i = 0; i < numbers.length; i++) {
            if(target == numbers[i]){
                position = i;
                break;
            }
        }

        if (position != -1)
            System.out.printf("Target found at index %d.\n", position);
        else
            System.out.println("Target not found.");*/
        /*//bubble sort
        int[] numbers = {7, 4, 2, 18, -3, 45, 54, 23, 66, -109};
        int temp;
        System.out.println("Unsorted Array: " + Arrays.toString(numbers));

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length - i - 1; j++){
                if (numbers[j]>numbers[j+1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(numbers));*/

        //static meaning - static methods can only be called inside other static methods.

        /*//more efficient bubble sort
        int[] numbers1 = {1,2,3,4,5,6,7,8,10};
        int temp1;
        int count;
        boolean hasSwapped = false;

        for(int i = 0; i < )*/

        //stacks (Classes)
        //operations - pop, push, peek | parse/traverse

        //Advice - When given a problem
        /* State your requirements in a single sentence.
         * Output
         * Input
         * */

        //Classes
        /* data members == instance variables == properties
         * member functions == methods
         *
         * every object inherits from the Object class which has toString,..etc.
         *
         * instantiation
         *
         *
         *
         */
        //instantiation
        Stack stack = new Stack();
        Stack stack1 = new Stack(9);
        Stack stack2 = new Stack(9, new int[] {1,2,3,4,5,6,7,8,9});
    }
}


/* Assignments
 * 1. Research on Asymptotic Analysis (ie. how complexity of algorithms is found)
 *
 * */