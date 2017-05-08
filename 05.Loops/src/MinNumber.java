import java.util.Scanner;
public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <n; i++) {
            int readNumber = Integer.parseInt(scan.nextLine());
            if(readNumber < min){
                min = readNumber;
            }
        }
        System.out.println(min);

    }
}
