package _3_encapsulation;
import java.util.Date;

public class Student {
    private String name;
    private Date dob;
    private String level;
    private String course;
    private String rollNumber;
    private String gender;

    //constructors
    public Student(){}
    //overloading + Delegation
    private Student(String gender){ //chaley more delegation!
        if (!(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female"))){
            throw new java.lang.RuntimeException("Gender must be Male or Female");
        }
        this.gender = gender;
    }
    public Student(String name, String gender, String course){
        this(gender); //more delegation!!
        this.name = name;
        this.course = course;
    }


    //Accessor methods
    public String getName(){
        return this.name;
    }

    public Date getDob(){
        return this.dob;
    }

    public String getLevel(){
        return this.level;
    }

    public String getCourse(){
        return this.course;
    }

    public String getRollNumber(){
        return this.rollNumber;
    }

    public String getGender(){
        return this.gender;
    }

    //Mutator methods
    public void setName(String name){
        this.name = name;
    }

    public void setDob(Date date){
        this.dob = date;
    }

    public void setLevel(String level){
        this.level = level;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public void setRollNumber(String rollNumber){
        this.rollNumber = rollNumber;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
}
