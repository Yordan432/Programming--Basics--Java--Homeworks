import java.util.Scanner;

public class p8IncreasingElements {
    static final int DEFAULT_VALUE = -1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int prevValue = DEFAULT_VALUE;
        int max = 0;
        int currentMaxLenght = 0;
        for (int i = 0; i <n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (prevValue < number){
                currentMaxLenght++;
            }else {
                currentMaxLenght = 1;
            }
            prevValue = number;
            if (max < currentMaxLenght){
                max = currentMaxLenght;
            }
        }
        System.out.println(max);
    }
}
