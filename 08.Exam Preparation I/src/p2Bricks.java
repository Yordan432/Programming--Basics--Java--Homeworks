import java.util.Scanner;

public class p2Bricks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBricks = Integer.parseInt(scanner.nextLine());
        int numberOfWorked = Integer.parseInt(scanner.nextLine());
        int carsWithBricks = Integer.parseInt(scanner.nextLine());

        double totalWorked = numberOfWorked * carsWithBricks;
        double numberOfCourses = Math.ceil(numberOfBricks / totalWorked);

        System.out.println(numberOfCourses);
    }
}
