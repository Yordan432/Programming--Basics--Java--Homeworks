import java.util.Scanner;

public class p11EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter even number: ");
        int number = Integer.parseInt(scanner.nextLine());
        boolean isEven = number % 2 == 0;
        while (!isEven){
            System.out.println("The number is not even.");
            System.out.println("Enter even number: ");
            number = Integer.parseInt(scanner.nextLine());
            isEven = number % 2 == 0;
        }
        System.out.printf("Even number entered: %s", number);
    }
}
