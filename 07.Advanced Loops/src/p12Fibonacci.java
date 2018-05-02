import java.util.Scanner;

public class p12Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 1;
        int number = Integer.parseInt(scanner.nextLine());

        int counter = 1;
        while (counter <= number){
            int sum = first + second;
            first = second;
            second = sum;
            counter++;
        }
        System.out.println(second);
    }
}
