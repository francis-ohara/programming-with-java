package _4_inheritance.session1;
import java.util.Date;
import java.util.Calendar;

public class Question {
    private String prompt;
    private String[] options;
    private int answer;
    private Difficulty difficulty;
    private double marks;
    private String nameOfPublisher;
    private Date datePublished;

    //constructors
    public Question(){}

    public Question(String prompt, String[] options, int answer) throws Exception {
        this.prompt = prompt;
        this.options = options;
        this.setAnswer(answer);
        this.difficulty = Difficulty.MEDIUM;
        this.datePublished = new Date();
        this.marks = 5;
        this.nameOfPublisher = "Anonymous";
    }

    public Question(String prompt, String[] options, int answer, Difficulty difficulty, double marks, String nameOfPublisher, Date datePublished) {
        this.prompt = prompt;
        this.options = options;
        this.answer = answer;
        this.difficulty = difficulty;
        this.marks = marks;
        this.nameOfPublisher = nameOfPublisher;
        this.datePublished = datePublished;
    }


    //getters and setters

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) throws Exception {
        if (answer>=0 && answer<options.length) {
            this.answer = answer;
        } else throw new Exception("Answer out of range of options!");
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getNameOfPublisher() {
        return nameOfPublisher;
    }

    public void setNameOfPublisher(String nameOfPublisher) {
        this.nameOfPublisher = nameOfPublisher;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    //display method
    public String display(){
        String result = String.format("Question: %s\n", this.prompt);
        for(int i = 0; i < this.options.length; i++)
            result = result + (i+1) + " - " + this.options[i] + "\n";
        return result;
    }

    //verifyAnswer method
    public String verifyAnswer(int answer){
        return (answer - 1 == this.answer)?"Correct!": "Wrong Answer!";
    }
}
