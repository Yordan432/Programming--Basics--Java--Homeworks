import java.util.Scanner;

public class p9PerfectDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int spaces = n - 1;
        int countStars = 1;
        int dashWithStars = 0;
        firstPart(n);
        spaces = 1;
        for (int i = n - 1; i >=1; i--) {
            System.out.print(printString(' ', spaces));
            System.out.print("*");

            for (int j = 0; j <i - 1; j++) {
                System.out.print("-*");
            }
            System.out.println();
            spaces++;
        }
    }

    private static void firstPart(int n) {
        for (int i = 1; i <=n; i++) {
            System.out.print(printString(' ', n - i));
            System.out.print("*");

            for (int j = 0; j <i - 1; j++) {
                System.out.print("-*");
            }
            System.out.println();
        }
    }

    static String printString(char symbol, int count){
        String result = "";
        for (int i = 0; i <count; i++) {
            result +=symbol;
        }
        return result;
    }
}
