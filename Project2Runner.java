import java.util.Random;
import java.util.Scanner;
public class Project2Runner {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner();
        final int SIZE = rand.nextInt(3,11);
        double[] numericalScores = {};
        char[] letterScores = {};

        System.out.println("You will need to enter " + SIZE + " test scores.");
        for(int i = 1; i <= numericalScores.length; i++){
            System.out.println("Please input test score " + i + ": ");
            numericalScores[i] = scan.nextLine();
        }
        for(int i = 0; i <= numericalScores.length; i++){
            getLetterGrade(double score);
        }
        printHighestScore(numericalScores[]);
        printLowestScore(numericalScores[]);
        printAverageScore(numericalScores[]);
        printGrades(numericalScores, letterScores);

    }
}
