import java.lang.reflect.Array;
import java.util.Scanner;

public class p12EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] numbersArray = new int[n];
        for (int i = 0; i <n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            int sum = num1 + num2;
            numbersArray[i] = sum;
        }
        int maxDifferece = 0;
        boolean isHaveEquals = true;
        for (int i = 0; i <numbersArray.length - 1; i++) {
            int currentNumber = numbersArray[i];
            int nextNumber = numbersArray[i + 1];

            if (!(currentNumber == nextNumber)){
                //find max difference
                int min = Integer.MAX_VALUE;
                for (int j = 0; j <numbersArray.length; j++) {
                    if (numbersArray[j] < min){
                        min = numbersArray[j];
                    }
                }
                int max = Integer.MIN_VALUE;
                for (int k = 0; k <numbersArray.length; k++) {
                    if (numbersArray[k] > max){
                        max = numbersArray[k];
                    }
                }
                while (min < max){
                    maxDifferece++;
                    min++;
                }
                isHaveEquals = false;
                break;
            }
        }
        if (isHaveEquals){
            System.out.printf("Yes, value=%s", numbersArray[0]);
        }else {
            System.out.printf("No, maxdiff=%s", maxDifferece);
        }
    }
}
