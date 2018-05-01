import java.util.Scanner;

public class p7ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countSpace = n + 1;
        for (int s = 0; s <countSpace; s++) {
            System.out.print(" ");
        }
        System.out.println("|");
        countSpace-=2;
        int stars = 1;
        for (int i = 0; i <n - 1; i++) {
            for (int s = 0; s <countSpace; s++) {
                System.out.print(" ");
            }
            for (int asteriks = 0; asteriks < stars; asteriks++) {
                System.out.print("*");
            }
            System.out.print(" | ");

            for (int asteriks = 0; asteriks < stars; asteriks++) {
                System.out.print("*");
            }
            System.out.println();
            countSpace--;
            stars++;

        }
    }
}
