import java.util.Scanner;
public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i <n; i++) {
            if(i % 2 == 0){
                evenSum+=Integer.parseInt(scan.nextLine());
            }
            else{
                oddSum+=Integer.parseInt(scan.nextLine());
            }
        }
        if(evenSum == oddSum){
            System.out.println("Yes");
            System.out.println("Sum = " + oddSum);
        }
        else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(evenSum - oddSum));
        }
    }
}
