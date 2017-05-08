import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int number = 1;
        while (number <=n){
            System.out.println(number);
            number = number * 2 + 1;
        }
        /*
        for (int i = 1; i <=n; i=2*i + 1) {
            System.out.println(i);
        }
        */
    }
}
