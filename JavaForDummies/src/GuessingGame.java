import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Digite um número de 1 à 10: ");

        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;

        if (inputNumber == randomNumber) {
            System.out.println("*****************");
            System.out.println("* Você acertou! *");
            System.out.println("*****************");
        } else {
            System.out.println("Você perdeu!");
            System.out.println("O número aleatório era " + randomNumber + ".");
            System.out.println("Obrigado por jogar!");

            keyboard.close();
        }
    }
}
