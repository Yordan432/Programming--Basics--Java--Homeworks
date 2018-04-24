import java.util.Scanner;

public class p9ConverterDegreesToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degrees = Double.parseDouble(scanner.nextLine());

        double celsius = degrees * 1.8 + 32;

        System.out.println(celsius);
    }
}
