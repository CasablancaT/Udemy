package practice;

public class Methods {

    //   video 47
    public static void main(String[] args) {


        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
        calculateScores(true,618,3,2323);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }


    }

    public static int calculateScores(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;

    }
}

