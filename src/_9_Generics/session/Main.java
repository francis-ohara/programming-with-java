package _9_Generics.session;

import java.util.ArrayList;
import java.util.HashMap;
public class Main {
    public static void main(String[] args){
        //Next topics
        // 1. Packages
        // 2. Exception Handling
        // 3. Generics

        /*
        * Assignment
        * Learn about packages
        * Write about packages
        * Code about packages
        * Make slides about packages
        * Submit in the drive.
        * */

        // Instantiate an ArrayList object.
        ArrayList<String> names = new ArrayList<>(10);
        names.add("Andy");
        names.add("Carter");
        names.add(1,"Etornam");
        System.out.println(names);

        //  Instantiate a Hashmap object.
        HashMap<String, Student> students = new HashMap<>();
        Student francis = new Student("Francis O'Hara Aidoo", Level.L200, Programme.IT);
        students.put("10101100101", francis);
        System.out.println(students.get("10101100101"));
    }
}
