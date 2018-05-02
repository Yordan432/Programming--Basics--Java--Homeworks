import java.util.Scanner;

public class p6NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Еnter a number in the range [1...100]: ");
        int number = Integer.parseInt(scanner.nextLine());

        boolean isRange = number >= 1 && number <=100;
        while (!isRange){
            System.out.println("Invalid number!");
            System.out.print("Еnter a number in the range [1...100]: ");
            number = Integer.parseInt(scanner.nextLine());
            isRange = number >= 1 && number <=100;
        }
        System.out.printf("The number is: %s" ,number);
    }
}
