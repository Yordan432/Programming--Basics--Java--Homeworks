import java.util.Scanner;

public class ElementsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            sum+= currentNumber;
            if(currentNumber > max){
                max = currentNumber;
            }
        }
        if(max == sum - max){
            System.out.println("Yes sum = " + max);
        }
        else {
            int diff = Math.abs(max - (sum - max));
            System.out.println("No Diff, " + diff);
        }
    }
}
