import java.util.Scanner;

public class p10PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number < 2){
            System.out.println("Not Prime");
        }else {
            boolean isPrime = true;
            int divider = 2;
            for (int i = 1; i < number - 1; i++) {
                if (number % divider == 0){
                    isPrime = false;
                }
                divider++;
            }
            if(isPrime){
                System.out.println("Prime");
            }else {
                System.out.println("Not Prime");
            }
        }
    }
}
