package SempleCalculates;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area = Double.parseDouble(scan.nextLine());
        double result = area * area;
        System.out.println(result);

    }
}
