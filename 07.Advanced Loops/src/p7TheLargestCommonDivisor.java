import java.util.Scanner;

public class p7TheLargestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        while (secondNumber != 0){
            int oldValue =secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = oldValue;
        }
        System.out.println(firstNumber);
    }
}
