import java.util.Scanner;

public class p10ElementEqualOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int max = 0;
        int sum = 0;
        for (int i = 0; i < number; i++)
        {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber > max)
            {
                max = currentNumber;
            }
            sum += currentNumber;
        }
        sum = sum - max;
        if (sum == max)
        {
            System.out.println("Yes");
            System.out.printf("Sum = %s", sum);
        }
        else
        {
            int diff = Math.abs(sum - max);
            System.out.println("No");
            System.out.printf("Diff = %s" , diff);
        }

    }
}
