package _9_Generics.class_test;

public class Main {
    public static void main(String[] args){
        // solve the ff HackerRank Questions
        //inheritance1, inheritance2, abstractclasses, interfaces, to java-method-overriding2


/*
* // 1) INHERITANCE-1
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
	void walk()
	{
		System.out.println("I am walking");
	}
}
class Bird extends Animal
{
	void fly()
	{
		System.out.println("I am flying");
	}
    void sing(){
        System.out.println("I am singing");
    }
}

public class Solution{

   public static void main(String args[]){

	  Bird bird = new Bird();
	  bird.walk();
	  bird.fly();
      bird.sing();

   }
}

-----------------------------------------------------------------------------------------

// 2) INHERITANCE-2
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here
class Arithmetic{
    int add(int a, int b){
        return a + b;
    }
}
class Adder extends Arithmetic{

}

public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}


-----------------------------------------------------------------------------------------


// 3) ABSTRACT-CLASSES
import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}

}

//Write MyBook class here

class MyBook extends Book{
    void setTitle(String s){
        this.title = s;
    }
}

public class Main{

	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();

	}
}


----------------------------------------------------------------------------------------

// 4) INTERFACE
import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int sum=0;
        for(int i = 1; i <= n; i++)
            sum += (n%i == 0)?i:0;
        return sum;
    }
}
class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    *
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented

        static void ImplementedInterfaceNames(Object o){
            Class[] theInterfaces = o.getClass().getInterfaces();
            for (int i = 0; i < theInterfaces.length; i++){
                String interfaceName = theInterfaces[i].getName();
                System.out.println(interfaceName);
            }
        }
    }

-------------------------------------------------------------------------------------------

// 5) METHOD-OVERRIDING-1
        import java.util.*;
    class Sports{

        String getName(){
            return "Generic Sports";
        }

        void getNumberOfTeamMembers(){
            System.out.println( "Each team has n players in " + getName() );
        }
    }

    class Soccer extends Sports{
        @Override
        String getName(){
            return "Soccer Class";
        }

        // Write your overridden getNumberOfTeamMembers method here
        @Override
        void getNumberOfTeamMembers(){
            System.out.println("Each team has 11 players in " + getName());
        }
    }

    public class Solution{

        public static void main(String []args){
            Sports c1 = new Sports();
            Soccer c2 = new Soccer();
            System.out.println(c1.getName());
            c1.getNumberOfTeamMembers();
            System.out.println(c2.getName());
            c2.getNumberOfTeamMembers();
        }
    }

-----------------------------------------------------------------------------------------

// 6) METHOD OVERRIDING 2 (SUPER KEYWORD)
        import java.util.*;
import java.io.*;


    class BiCycle{
        String define_me(){
            return "a vehicle with pedals.";
        }
    }

    class MotorCycle extends BiCycle{
        String define_me(){
            return "a cycle with an engine.";
        }

        MotorCycle(){
            System.out.println("Hello I am a motorcycle, I am "+ define_me());

            String temp=super.define_me(); //Fix this line

            System.out.println("My ancestor is a cycle who is "+ temp );
        }

    }
    class Solution{
        public static void main(String []args){
            MotorCycle M=new MotorCycle();
        }
    }









* */

    }
}
