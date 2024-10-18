public class printLowestScore {
    public double printLowestScore (numericalScores[]){
        double lowestScore = 0;
        for(int i = 0; i < numericalScores.length; i++){
            if (numericalScores[i] < lowestScore){
                lowestScore = numericalScores[i];
            }
        }
        System.out.println("Lowest Score: " + lowestScore);
    }
}
