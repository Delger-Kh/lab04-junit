package mn.edu.must.sqat;

public class GradeCalculator {

  
public String letterGrade(double score) {
    if (score < 0 || score > 100) {
        throw new IllegalArgumentException("Score must be between 0 and 100: " + score);
    }
    if (score >= 90) return "A";
    if (score >= 80) return "B";
    if (score >= 70) return "C";
    if (score >= 60) return "D";
    return "F";
}

    // max points: att 10, lab 40, quiz1 10, quiz2 10, exam 30
public double totalScore(double att, double lab, double quiz1, double quiz2, double exam) {
    check(att, 10);
    check(lab, 40);
    check(quiz1, 10);
    check(quiz2, 10);
    check(exam, 30);
    return att + lab + quiz1 + quiz2 + exam;
    }

  private void check(double value, double max) {
    if (value < 0 || value > max) {
        throw new IllegalArgumentException("Value " + value + " must be between 0 and " + max);
    }
    }
}