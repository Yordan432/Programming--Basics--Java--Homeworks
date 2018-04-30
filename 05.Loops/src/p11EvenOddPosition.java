import java.util.Scanner;

public class p11EvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;

        double evenSum = 0;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;

        int row = 1;
        for (int i = 0; i < n; i++)
        {
            double currentNumber = Double.parseDouble(scanner.nextLine());
            if (row % 2 == 1)
            {
                oddSum += currentNumber;
                if (oddMin > currentNumber)
                {
                    oddMin = currentNumber;
                }
                if (oddMax < currentNumber)
                {
                    oddMax = currentNumber;
                }
            }
            else
            {
                evenSum += currentNumber;
                if (evenMin > currentNumber)
                {
                    evenMin = currentNumber;
                }
                if (evenMax < currentNumber)
                {
                    evenMax = currentNumber;
                }
            }
            row++;
        }
        String oddMinAsString = oddMin + "";
        String oddMaxAsString = oddMax + "";

        System.out.printf("OddSum=%s\n", oddSum);
        System.out.printf("OddMin=%s\n", oddMin != Integer.MAX_VALUE ? oddMinAsString: "no");
        System.out.printf("OddMax=%s\n" , oddMax != Integer.MIN_VALUE ? oddMaxAsString : "no");

        String evenMinAsString = evenMin + "";
        String evenMaxAsString = evenMax + "";
        System.out.printf("EvenSum=%s\n" , evenSum);
        System.out.printf("EvenMin=%s\n", evenMin != Integer.MAX_VALUE ? evenMinAsString : "no");
        System.out.printf("EvenMax=%s\n", evenMax != Integer.MIN_VALUE ? evenMaxAsString : "no");
    }
}
