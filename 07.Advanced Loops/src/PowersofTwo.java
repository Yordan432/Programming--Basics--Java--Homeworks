import java.text.DecimalFormat;
import java.util.Scanner;
public class PowersofTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <=n*2; i++) {
           // DecimalFormat df = new DecimalFormat("#");
           // System.out.println(df.format(Math.pow(2 , i)));
            System.out.println(i);
        }

    }
}
