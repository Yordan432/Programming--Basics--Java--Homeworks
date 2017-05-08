import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int factoriel = 1;
        do {
         factoriel*=n;
            n--;
        }while (n >1);
        System.out.println(factoriel);
        /*
        for (int i = 2; i <=n; i++) {
             factoriel*=i;
        }
        System.out.println(factoriel);
        */
    }
}
