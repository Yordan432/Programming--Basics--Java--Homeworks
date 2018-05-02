import java.util.Scanner;

public class p14TableOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <=n; row++) {
            for (int col = row; col <=n; col++) {
                System.out.print(col + " ");
            }
            for (int col = n - 1; col >n - row; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
