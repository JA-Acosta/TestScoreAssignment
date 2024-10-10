/* Programmer: JAAR
*  Assignment Chapter: 4 Assignment 3
*  Date modified: 10/09/2024
*  IDE/Tool used: IntelliJ
*/

// This class is a list of test scores. It draws conclusions based on the
// data corresponding to the list.
import java.util.List;
import java.util.ArrayList;

public class TestScores {
    // Private Variables:
    private List<Double> testScores;

    // Constructor:
    TestScores(double ... scores) {
        testScores = new ArrayList<>();
        for ( double i : scores ) {
            testScores.add(i);
        }
    }

    TestScores(List<Double> testScores) {
        this.testScores = new ArrayList<>(testScores); // Maintains data
        // encapsulation.
    }

    // Getters:

    // This method gets a score from the list of scores.
    // Param:
    //  - int i: element representing the test score
    // Return:
    //  - double score: the score stored in the list given the element.
    public double getTestScores(int i) {
        return testScores.get(i);
    }

    // This method gets the letter grade based on a specific test in the list.
    // Param:
    //  - int i: element representing the test score
    // Return:
    //  - char letterGrade: the letter grade corresponding to the test
    public char getLetterGrade(int i) {
        return  getLetterGrade(testScores.get(i));
    }

    // This method determines the letter grade based on the test score.
    // Param:
    //  - double score: the test score used to derive the letter grade.
    // Return:
    //  - char Letter: the letter grade corresponding to the score value.
    private char getLetterGrade(double score) {
        char letter; // Flag
        if (90 < score) {
            letter = 'A';
        } else if (80 < score) {
            letter = 'B';
        } else if (70 < score) {
            letter = 'C';
        } else if (60 < score) {
            letter = 'D';
        } else {
            letter = 'F';
        }
        return letter;
    }

    // This method calculates the average test score based on the list of
    // test scores.
    // Return:
    //  - double averageScore: the average of all the test scores in the list.
    public double averageTestScore() {
        double sum = 0;
        for ( double score: testScores) {
            sum += score;
        }
        return  sum / testScores.size();
    }

    // This method determines the average letter grade for the test scores list.
    // Return:
    //  - char grade: the letter grade corresponding to the average test
    //  scores.
    public char averageLetterGrade() {
        return getLetterGrade(averageTestScore());
    }
}
