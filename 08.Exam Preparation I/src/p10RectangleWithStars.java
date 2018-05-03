import java.util.Scanner;

public class p10RectangleWithStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int profitSymbolCount = n * 2;
        System.out.println(printProfitSymbol(profitSymbolCount));
        int middleCount = n % 2 == 0 ? n - 1 : n;

        int middleSymbol = (n - 1) / 2;
        for (int i = 0; i <middleCount; i++) {
            System.out.print("%");
            if (i == middleSymbol){
                System.out.print(printString(' ', n - 2));
                System.out.print("**");
                System.out.print(printString(' ', n - 2));
            }else {
                System.out.print(printSpaces(n * 2 - 2));
            }
            System.out.print("%");
            System.out.println();
        }
        System.out.println(printProfitSymbol(profitSymbolCount));
    }

    private static String printString(char c, int i) {
        String result = "";

        for (int j = 0; j <i; j++) {
            result +=c;
        }
        return result;
    }

    private static String printSpaces(int i) {
        String result = "";
        for (int j = 0; j <i; j++) {
            result += " ";
        }
        return result;
    }

    private static String printProfitSymbol(int profitSymbolCount) {
        String result = "";
        for (int i = 0; i <profitSymbolCount; i++) {
            result +="%";
        }
        return result;
    }
}
