import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        double result = number * 1.79549;
        System.out.printf("%.2f", result);
    }
}
