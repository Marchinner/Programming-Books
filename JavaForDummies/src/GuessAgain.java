import java.util.Scanner;
import java.util.Random;
public class GuessAgain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int numGuesses = 0;
        int randomNumber = new Random().nextInt(10) + 1;

        System.out.println("          ************         ");
        System.out.println("Bem-vindo ao jogo de advinhação");
        System.out.println("          ************         ");
        System.out.println();

        System.out.print("Digite um inteiro de 1 até 10: ");
        int inputNumber = keyboard.nextInt();
        numGuesses++;

        while (inputNumber != randomNumber) {
            System.out.println();
            System.out.println("Tente novamente...");
            System.out.print("Digite um inteiro de 1 até 10: ");
            inputNumber = keyboard.nextInt();
            numGuesses++;
        }
        System.out.println("Você acertou depois de " + numGuesses + " tentativas.");

        keyboard.close();
    }
}
