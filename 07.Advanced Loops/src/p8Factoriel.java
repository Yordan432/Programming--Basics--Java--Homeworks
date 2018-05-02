import java.util.Scanner;

public class p8Factoriel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factoriel = 1;
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=number; i++) {
           factoriel *= i;
        }
        System.out.println(factoriel);
    }
}
