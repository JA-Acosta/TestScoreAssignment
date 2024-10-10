/* Programmer: JAAR
* Assignment Chapter: 4 Question 3
* Date modified: 10/09/2024
* IDE/Tool used: IntelliJ
*/

import java.sql.SQLOutput;
import java.util.ArrayList;

// Testing environment for the test score class.
public class Main {
    public static void main(String[] args) {
        // List of test scores for testing constructor.
        ArrayList<Double> testScoresList = new ArrayList<>();
        testScoresList.add(98.50);
        testScoresList.add(95.45);
        testScoresList.add(84.50);

        // Test with multiple hardCoded values that fall between 0 and 100.
        TestScores scoresListOne = new TestScores(50.05, 95.34, 100, 85.7);
        // Test with ArrayList:
        TestScores scoresListTwo = new TestScores(testScoresList);



        // Get the score for a random integer to verify getTestScore and
        // getLetterGrade functionality.
        System.out.println("Test List 1");
        System.out.println("Test score value: "
                + scoresListOne.getTestScores(3));
        System.out.println("Letter grade for test score: "
                + scoresListOne.getLetterGrade(3));
        System.out.println();
        // Test the getAverageScore and getAverageLetter
        System.out.printf("Average test score: %.2f",
                scoresListOne.averageTestScore());
        System.out.println();
        System.out.println("Average letter grade: "
                + scoresListOne.averageLetterGrade());
        System.out.println();
        System.out.println();


        System.out.println("Test List 2");
        System.out.println("Test score value: "
                + scoresListTwo.getTestScores(1));
        System.out.println("Letter grade for test score: "
                + scoresListTwo.getLetterGrade(1));
        System.out.println();
        // Test the getAverageScore and getAverageLetter
        System.out.printf("Average test score: %.2f",
                scoresListTwo.averageTestScore());
        System.out.println();
        System.out.println("Average letter grade: "
                + scoresListTwo.averageLetterGrade());
    }


}