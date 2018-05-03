import java.util.Scanner;

public class p11Increasing4Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        boolean isHaveIncreasingNumbers = false;
        for (int i = a; i <=b; i++) {
            for (int j = i + 1; j <=b; j++) {
                for (int k = j + 1; k <=b; k++) {
                    for (int l = k + 1; l <=b; l++) {
                        System.out.printf("%s %s %s %s\n" , i, j,k,l);
                        isHaveIncreasingNumbers = true;
                    }
                }
            }
        }
        if (!isHaveIncreasingNumbers){
            System.out.println("No");
        }
    }
}
