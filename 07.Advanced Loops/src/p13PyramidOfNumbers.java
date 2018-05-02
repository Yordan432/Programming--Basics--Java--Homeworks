import java.util.Scanner;

public class p13PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        for (int i = 1; i <=number; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" " + counter);
                counter++;
                if (counter > number){
                    break;
                }
            }
            if (counter > number){
                break;
            }
            System.out.println();
        }
    }
}
