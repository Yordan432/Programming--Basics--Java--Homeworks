import java.util.Scanner;

public class p1SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());

        double area = a * a;

        System.out.printf("Area is %s", area);
    }
}
