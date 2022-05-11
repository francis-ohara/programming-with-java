package _5_inheritance.session1;
import java.util.Date;

public class Player {
    private String name;
    private Date dateOfBirth;       //3 Rules of Normalization of Databases.
    private byte jerseyNumber;
    private String team; // enum/class
    private Nationality nationality; // enum/class
    private Position position; // enum/class
    private double height; //
    private double weight;
    private Foot preferredFoot; // enum/class



    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setJerseyNumber(byte jerseyNumber){
        this.jerseyNumber = jerseyNumber;
    }
    public byte getJerseyNumber(){
        return this.jerseyNumber;
    }

    public void setNationality(Nationality nationality){
        this.nationality = nationality;
    }
    public Nationality getNationality(){
        return this.nationality;
    }

    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setTeam(String team){
        this.team = team;
    }
    public String getTeam(){
        return this.team;
    }

    public void setPosition(Position position){
        this.position = position;
    }

    public Position getPosition(){
        return this.position;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setPreferredFoot(Foot preferredFoot){
        this.preferredFoot = preferredFoot;
    }

    public Foot getPreferredFoot(){
        return this.preferredFoot;
    }

}
