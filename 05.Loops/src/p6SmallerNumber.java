import java.util.Scanner;

public class p6SmallerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int smallerNumber = Integer.MAX_VALUE;
        for (int i = 0; i <n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < smallerNumber){
                smallerNumber = number;
            }
        }
        System.out.println(smallerNumber);
    }
}
