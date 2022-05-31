package _8_problem_solving.assignment;

public class User {
    private String name;
    private Course[] courses;
    private Programme programme;
    private String email;
    private String password;
    private String occupation;

    public User(String name, Course[] courses, Programme programme, String email, String password, String occupation) {
        this.name = name;
        this.courses = courses;
        this.programme = programme;
        this.email = email;
        this.password = password;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public Programme getProgramme() {
        return programme;
    }

    public void setProgramme(Programme programme) {
        this.programme = programme;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
