import java.util.Scanner;

public class p6RombOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countSpace = n - 1;
        int row = 1;
        for (int i = 0; i <n; i++) {
            for (int s = 0; s <countSpace; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <row; j++) {
                System.out.print("* ");
            }
            row++;
            System.out.println();
            countSpace--;
        }
        countSpace = 1;
        row = n - 1;
        for (int i = 0; i <n - 1 ; i++) {
            for (int s = 0; s <countSpace; s++) {
                System.out.print(" ");
            }
            for (int r   = 0; r < row; r++) {
                System.out.print("* ");
            }
            row--;
            countSpace++;
            System.out.println();
        }
    }
}
