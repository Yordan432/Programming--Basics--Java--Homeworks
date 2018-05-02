import java.util.Scanner;

public class p9SumDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberAsString = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i <numberAsString.length(); i++) {
            int convertToNumber = numberAsString.charAt(i) - '0';
            sum +=convertToNumber;
        }
        System.out.println(sum);
    }
}
