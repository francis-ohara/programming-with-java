package _9_Generics.session;


enum Programme {
    IT,
    COMPUTER_SCIENCE,
    COMPUTER_ENGINEERING,
    MECHANICAL_ENGINEERING,
    ELECTRICAL_AND_ELECTRONICS_ENGINEERING,
    BUSINESS_ADMINISTRATION
}
enum Level {
    L100,
    L200,
    L300,
    L400
}

public class Student {
    private String name;
    private Level level;
    private Programme programme;

    public Student(String name, Level level, Programme programme){
        this.name = name;
        this.level = level;
        this.programme = programme;
    }

    public Student(){
        this.name = "Unknown";
        this.level = Level.L100;
        this.programme = Programme.COMPUTER_SCIENCE;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s)", this.name, this.level.name(), this.programme.name());
    }
}
