import java.util.Scanner;

public class p7SumsStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int firstSum = 0;
        int secondSum = 0;
        int thirdSum = 0;

        for (int i = 0; i <n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0){
                // first sum
                firstSum+=number;
            }else if(i % 3 == 1){
                //second sum
                secondSum +=number;
            }else if(i % 3 == 2){
                //third sum
                thirdSum +=number;
            }
        }
        System.out.printf("sum1 = %s\n" , firstSum);
        System.out.printf("sum2 = %s\n" , secondSum);
        System.out.printf("sum3 = %s\n" , thirdSum);
    }
}
