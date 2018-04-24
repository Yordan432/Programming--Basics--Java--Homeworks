import java.util.Scanner;

public class p3FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int maxNumber = 0;

        if (firstNumber > secondNumber){
            maxNumber = firstNumber;
        }else {
            maxNumber = secondNumber;
        }

        System.out.println(maxNumber);
    }
}

