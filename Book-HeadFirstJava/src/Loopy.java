public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Antes do loop");
        while (x < 4) {
            System.out.println("No loop");
            System.out.println("O valor de x é " + x);
            x += 1;
        }
        System.out.println("Depois do loop");
    }
}
