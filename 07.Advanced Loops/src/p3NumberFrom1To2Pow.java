import java.util.Scanner;

public class p3NumberFrom1To2Pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        for (int i = 1; i <=n; i++) {
            int pow = num * 2;
            System.out.println(pow);
            num = pow;
        }
    }
}
