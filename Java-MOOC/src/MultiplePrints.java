import java.util.Scanner;
public class MultiplePrints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int xTimes;

        System.out.println("How much do you want to print?");
        xTimes = scanner.nextInt();

        printXTimes(xTimes);
    }

    public static void printXTimes(int xTimes) {
        int i = 0;
        while (i < xTimes) {
            System.out.println("Greetings!");
            i++;
        }
    }
}
