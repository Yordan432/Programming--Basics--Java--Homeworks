import java.util.Scanner;

public class p2NumbersEndWith7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1000;

        for (int i = 7; i <=number; i+=10) {
            System.out.println(i);
        }
    }
}
