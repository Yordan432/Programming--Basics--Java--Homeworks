import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //radians = degrees*MathPI/180; degrees = radians*180/MathPI;
        double radians = Double.parseDouble(scan.nextLine());
        double result = radians*180/Math.PI;
        System.out.printf("%.0f", result);
    }
}
