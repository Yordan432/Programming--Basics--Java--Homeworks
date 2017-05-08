import java.util.Scanner;
public class LeftRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        // Разделяме лява и дясна страна
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i <n; i++) {

            leftSum+=Integer.parseInt(scan.nextLine());
        }
        for (int i = 0; i <n; i++) {
            rightSum+=Integer.parseInt(scan.nextLine());
        }
        if(leftSum == rightSum){
            System.out.printf("Yes, sum %d" ,leftSum);
        }
        else {
            System.out.printf("No, diff = %d" , Math.abs(leftSum - rightSum));
        }
    }
}
