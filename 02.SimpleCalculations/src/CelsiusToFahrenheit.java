import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //F = °C × 1,8 + 32.
        double number = Double.parseDouble(scan.nextLine());
        double result = number * 1.8 + 32;
        System.out.println(result);
    }
}
