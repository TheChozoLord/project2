public class getLetterGrade {
    public char getLetterGrade(numericalScores[]){
        for(int i = 0; i < numericalScores.length; i++) {
            if (numericalScores[i] >= 90) {
                charGrade = "A";
            }
            else if (numericalScores[i] >= 80 && grade < 90) {
                charGrade = "B";
            }
            else if (numericalScores[i] >= 70 && grade < 80) {
                charGrade = "C";
            }
            else if (numericalScores[i] >= 60 && grade < 70) {
                charGrade = "D";
            }
            else if (numericalScores[i] < 60) {
                charGrade = "F";
            }
            letterScore[i] = charGrade;
        }
        return charGrade[];
    }
}
