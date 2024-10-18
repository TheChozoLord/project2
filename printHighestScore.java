public class printHighestScore {
    public double printHighestScore (numericalScores[]){
        double highestScore = 0;
        for(int i = 0; i < numericalScores.length; i++){
            if (numericalScores[i] > highestScore){
                highestScore = numericalScores[i];
            }
        }
        System.out.println("Highest Score: " + highestScore);
    }
}
