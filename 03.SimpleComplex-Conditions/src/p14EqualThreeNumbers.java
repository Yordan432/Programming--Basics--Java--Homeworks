import java.util.Scanner;
public class p14EqualThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        if (first == second && first == third){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
