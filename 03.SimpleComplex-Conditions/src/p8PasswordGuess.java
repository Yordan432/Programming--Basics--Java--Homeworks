import java.util.Scanner;

public class p8PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String securityPassword = "s3cr3t!P@ssw0rd";

        if (input.equals(securityPassword)){
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }
    }
}
