package _4_inheritance.session1;

import java.util.Scanner;

public class Main {
    //define a question class represent a question acity lecturers can pose to students.
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Question question1 = new Question("What is the scientific name for a dog?", new String[]{"Panthera Leo","Canis familiaris","Solaris","Helium"}, 1);
        System.out.print(question1.display());
        System.out.println(question1.getNameOfPublisher());

    }
}
