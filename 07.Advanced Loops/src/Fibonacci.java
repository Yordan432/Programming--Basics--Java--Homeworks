import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int count = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j % 2 == 0) {
                    System.out.println(n * j + i + 1);
                } else
             System.out.println(n * (j + 1) - i);
            System.out.print(i + count);

        }
        System.out.println();
    }
}
}
