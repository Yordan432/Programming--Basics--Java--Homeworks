import java.util.Scanner;

public class p5CalculateArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int area = a * b;

        System.out.printf("Area : %s" , area);
    }
}
