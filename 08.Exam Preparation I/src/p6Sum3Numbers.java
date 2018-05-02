import java.util.Scanner;

public class p6Sum3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int min = 0;
        int max = 0;
        int sum = 0;
        if(first + second == third){
            min = Math.min(first, second);
            max = Math.max(first, second);
            sum = third;

        }else if(first + third == second){
            min = Math.min(first, third);
            max = Math.max(first, third);
            sum = second;
        }else if(second + third == first){
            min = Math.min(second, third);
            max = Math.max(second, third);
            sum = first;
        }else {
            System.out.println("No");
            return;
        }
        System.out.printf("%s + %s = %s" , min, max, sum);
    }
}
