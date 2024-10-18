public class printAverageScore {
    public double printAverageScore(numericalScores[]){
        double averageScore;
        for(int i = 0; i < numericalScores.length; i++){
            averageScore = averageScore + numericalScores[i];
        }
        averageScore = averageScore/numericalScores.length;
        System.out.println("Average Score: " + averageScore);
    }
}
