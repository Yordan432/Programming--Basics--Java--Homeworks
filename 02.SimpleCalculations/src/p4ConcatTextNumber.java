import java.util.Scanner;
public class p4ConcatTextNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.printf("You are %s %s , a %s-years old person from %s",
                firstName, lastName, age,town);
    }
}

