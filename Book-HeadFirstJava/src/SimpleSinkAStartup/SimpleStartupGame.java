package SimpleSinkAStartup;

import java.util.Random;
import java.util.Scanner;

public class SimpleStartupGame {
    public static void main(String[] args) {
        java.util.Random randomCell = new Random();
        SimpleStartup dot = new SimpleStartup();

        int numOfGuesses = 1;
        int startingCell = randomCell.nextInt(7);
        boolean isAlive = true;
        int[] locationCells = {startingCell, startingCell + 1, startingCell + 2};

        dot.setLocationCells(locationCells);

        while (isAlive) {
            java.util.Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            String result = dot.checkYourself(userGuess);

            if (result.equals("miss")) {
                System.out.println("You miss!");
            } else if (result.equals("hit")){
                System.out.println("You hit!");
            } else {
                System.out.println("It tooks " + numOfGuesses + " guesses to sink a Startup!");
                isAlive = false;
                break;
            }
            numOfGuesses++;

        }
    }
}
