import java.util.Scanner;

public class p10Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n == 1)
        {
            System.out.println("*");
        }else {
            int countDash = (n - 1) / 2;
            for (int i = 0; i <countDash; i++) {
                System.out.print("-");
            }
            int evenStars = 2;
            int oddStars = 1;
            if (n % 2 == 0) {
                for (int i = 0; i <evenStars; i++) {
                    System.out.print("*");
                }
            } else {
                for (int i = 0; i <oddStars; i++) {
                    System.out.print("*");
                }
            }
            for (int i = 0; i <countDash; i++) {
                System.out.print("-");
            }
            System.out.println();
            int leftRight = countDash - 1;

            int mid = n - 2 * leftRight - 2;
            double midCount = Math.ceil((n - 2) / 2.0);
            for (int i = 0; i < midCount; i++) {
                for (int j = 0; j <leftRight; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int j = 0; j <mid; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int j = 0; j <leftRight; j++) {
                    System.out.print("-");
                }
                System.out.println();
                leftRight--;
                mid += 2;
            }
            mid = n - 2 * leftRight - 6;
            int countDown = (n - 2) / 2;
            for (int i = 1; i <= countDown; i++) {
                for (int j = 0; j <i; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int j = 0; j < mid; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int j = 0; j <i; j++) {
                    System.out.print("-");
                }
                mid -= 2;
                System.out.println();
            }
            if (n % 2 == 1) {
                for (int i = 0; i <countDash; i++) {
                    System.out.print("-");
                }
                for (int i = 0; i <oddStars; i++) {
                    System.out.print("*");
                }
                for (int i = 0; i <countDash; i++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
    }
}
