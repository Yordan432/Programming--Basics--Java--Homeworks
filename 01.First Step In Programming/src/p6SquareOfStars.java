import java.util.Scanner;
public class p6SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <size; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i <size - 2; i++) {
            System.out.print("*");
            for (int space = 0; space <size - 2; space++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i <size; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
