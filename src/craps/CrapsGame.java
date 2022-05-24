package craps;

import java.util.Random;

public class CrapsGame {

    public static void playCraps() {
        int playCounter = 1;
        int yourScore = 0;

        boolean isResultAchieved = false;
        while (!isResultAchieved) {
            int drawnValue = rollDice(2);
            System.out.println("Drawn value: " + drawnValue);
            if (playCounter == 1) {
                if (drawnValue == 7 || drawnValue == 11) {
                    System.out.println("Natural! You won.");
                    isResultAchieved = true;
                }
                else if (drawnValue == 2 || drawnValue == 3 || drawnValue == 12) {
                    System.out.println("Craps! You lost.");
                    isResultAchieved = true;
                }
                else {
                    yourScore = drawnValue;
                    System.out.println("That's your number, you have to drawn that number again before 7 to win.");
                }
            }
            else if (drawnValue == yourScore) {
                System.out.println("You won!");
                isResultAchieved = true;
            }
            else if (drawnValue == 7) {
                System.out.println("You lost!");
                isResultAchieved = true;
            }
            playCounter += 1;
        }
    }

    public static int rollDice(int diceAmount) {
        Random random = new Random();
        int minValue = diceAmount;
        int maxValue = 6 * diceAmount + 1;
        return random.nextInt(minValue, maxValue);
    }

}
