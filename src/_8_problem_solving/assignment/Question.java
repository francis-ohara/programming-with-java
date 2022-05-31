package _8_problem_solving.assignment;

public class Question {
    private String preamble;
    private Difficulty difficulty;
    private Option[] options;
    private Option answer;
    private double score;
    private String hint;
    private Course course;

    public Question(String preamble, Difficulty difficulty, Option[] options, Option answer, double score, String hint, Course course) {
        this.preamble = preamble;
        this.difficulty = difficulty;
        this.options = options;
        this.answer = answer;
        this.score = score;
        this.hint = hint;
        this.course = course;
    }

    public String getPreamble() {
        return preamble;
    }

    public void setPreamble(String preamble) {
        this.preamble = preamble;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Option[] getOptions() {
        return options;
    }

    public void setOptions(Option[] options) {
        this.options = options;
    }

    public Option getAnswer() {
        return answer;
    }

    public void setAnswer(Option answer) {
        this.answer = answer;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
