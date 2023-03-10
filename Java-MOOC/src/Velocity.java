import java.util.Scanner;
public class Velocity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float deltaPosition;
        float deltaTime; // in seconds (s)
        float averageVelocity = 0;

        System.out.println("How much the vehicle moved? (in meters)");
        deltaPosition = scanner.nextFloat();

        System.out.println("How much time it takes? (in seconds)");
        deltaTime = scanner.nextFloat();

        averageVelocity = deltaPosition / deltaTime;

        System.out.println("Average vehicle velocity = " + averageVelocity + " m/s");

        printText();
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
