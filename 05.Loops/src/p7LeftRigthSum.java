import java.util.Scanner;

public class p7LeftRigthSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        for (int i = 0; i <n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            leftSum += number;
        }

        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            rightSum +=number;
        }

        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %s", leftSum);
        }else {
            int max = Math.max(leftSum, rightSum);
            int min = Math.min(leftSum, rightSum);

            int diff = max - min;
            System.out.printf("No, diff = %s" , diff);
        }
    }
}
