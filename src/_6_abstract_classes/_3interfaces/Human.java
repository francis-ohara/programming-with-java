package _6_abstract_classes._3interfaces;

import java.util.Date;

public class Human implements Moveable{
    private String name;
    private Gender gender;
    private Date dateOfBirth;

    public Human(){
        this.name = "Unknown";
        this.gender = Gender.male;
        this.dateOfBirth = new Date();
    }

    public Human(String name, Gender gender, Date dateOfBirth){
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setGender(Gender gender){
        this.gender = gender;
    }

    public Gender getGender(){
        return this.gender;
    }

    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth(){
        return this.dateOfBirth;
    }

    @Override
    public void move(){

    }

}
