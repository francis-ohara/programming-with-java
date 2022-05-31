package _8_problem_solving.assignment;

public class Answer {
    private Question question;
    private Option[] options;
    private int choice;
    private boolean isCorrect;
    private double points;
    private User user;

    public Answer(Question question, Option[] options, int choice, boolean isCorrect, double points, User user) {
        this.question = question;
        this.options = options;
        this.choice = choice;
        this.isCorrect = isCorrect;
        this.points = points;
        this.user = user;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Option[] getOptions() {
        return options;
    }

    public void setOptions(Option[] options) {
        this.options = options;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
