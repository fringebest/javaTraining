package QuizEx;

public class CalcDistance {


    double carPosition (double positionXNew, double positionXOld, double positionYNew, double positionYOld){

        double position = Math.sqrt(Math.pow((positionXNew - positionXOld),2)) + Math.pow((positionYNew-positionYOld),2);

        return position;
    }
}
