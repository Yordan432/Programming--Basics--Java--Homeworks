import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        double width = Math.max(x1 , x2) - Math.min(x1 , x2); // Намираме най-малкото и най-голято от двете числа
        double heigt = Math.max(y1 , y2) - Math.min(y1 , y2);  // Прави същото като горното
        double p = 2 * heigt + 2 * width; // Умножава 2 по височината и 2 по ширината и ги събира
        double S = width * heigt; // Умножава височината по ширината
        System.out.println(S);
        System.out.println(p);

    }
}
