package _8_problem_solving.assignment;
import java.time.Duration;
public class Quiz {
    private Question[] questions;
    private Course course;
    private String instructions;
    private Duration duration;
    private boolean isTimed;
    private String title;
    private String description;

    public Quiz(Question[] questions, Course course, String instructions, Duration duration, boolean isTimed, String title, String description) {
        this.questions = questions;
        this.course = course;
        this.instructions = instructions;
        this.duration = duration;
        this.isTimed = isTimed;
        this.title = title;
        this.description = description;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public boolean isTimed() {
        return isTimed;
    }

    public void setTimed(boolean timed) {
        isTimed = timed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
