import java.util.Scanner;

public class p5LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int largestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (largestNumber < num){
                largestNumber = num;
            }
        }
        System.out.println(largestNumber);
    }
}
