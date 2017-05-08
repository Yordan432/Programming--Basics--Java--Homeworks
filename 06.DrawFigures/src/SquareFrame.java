import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <1; i++) {
            System.out.print("+ ");
            for (int j = 0; j <n - 2; j++) {
                System.out.print("- ");
            }
            System.out.print("+");
        }
        System.out.println();
        for (int k = 0; k <n - 2; k++) {
            System.out.print("| ");
            for (int c = 0; c <n-2; c++) {
                System.out.print("- ");
            }
            System.out.println("|");
        }

        for (int i = 0; i <1; i++) {
            System.out.print("+ ");
            for (int j = 0; j <n - 2; j++) {
                System.out.print("- ");
            }
            System.out.print("+");
        }
    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;


    }
}
