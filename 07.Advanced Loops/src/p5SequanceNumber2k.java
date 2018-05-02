import java.util.Scanner;

public class p5SequanceNumber2k {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;

        while (num <= n){
            System.out.println(num);
            num*=2;
            num++;

        }
    }
}
