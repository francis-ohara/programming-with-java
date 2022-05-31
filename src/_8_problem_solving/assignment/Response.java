package _8_problem_solving.assignment;

public class Response {
    private Quiz quiz;
    private User user;
    private Answer[] answers;
    private double totalScore;

    public Response(Quiz quiz, User user, Answer[] answers, double totalScore) {
        this.quiz = quiz;
        this.user = user;
        this.answers = answers;
        this.totalScore = totalScore;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }
}
