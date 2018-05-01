import java.util.Scanner;

public class p9House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int stars = n % 2 == 0 ? 2 : 1;
        int dash = (int)Math.ceil(n / 2.0) - 1;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int t = 0; t <dash; t++) {
                System.out.print("-");
            }
            for (int j = 0; j <stars; j++) {
                System.out.print("*");
            }
            for (int t = 0; t <dash; t++) {
                System.out.print("-");
            }
            System.out.println();
            stars+=2;
            dash--;
        }
        for (int i = 0; i <n / 2; i++) {
            System.out.print("|");
            for (int j = 0; j <n - 1; j++) {
                System.out.print("*");
            }
            System.out.println("|");
        }
    }
}
