import java.util.Scanner;

public class p8SummerSunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int stars = n * 2;
        int countSpace = n;

        for (int i = 0; i <stars; i++) {
            System.out.print("*");
        }
        for (int i = 0; i <countSpace; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i <stars; i++) {
            System.out.print("*");
        }
        System.out.println();
        int row = 1;
        for (int i = 0; i <n - 2; i++)
        {
            System.out.print("*");
            double expression = Math.ceil(n * 3.0 / 2);
            for (int slash = 0; slash <2 * n - 2; slash++) {
                System.out.print("/");
            }
            System.out.print("*");

            if (i == (n - 1) / 2 - 1)
            {
                for (int j = 0; j <n; j++) {
                    System.out.print("|");
                }
            }
            else
            {
                for (int j = 0; j <n; j++) {
                    System.out.print(" ");
                }
            }
            System.out.print("*");

            for (int sl = 0; sl <2 * n - 2; sl++) {
                System.out.print("/");
            }
            System.out.println("*");
            row++;
        }
        for (int i = 0; i <stars; i++) {
            System.out.print("*");
        }
        for (int i = 0; i <countSpace; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i <stars; i++) {
            System.out.print("*");
        }
    }
}
