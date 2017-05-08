import java.util.Scanner;
public class InvalidNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int isValidNumber = Integer.parseInt(scan.nextLine());
        boolean isValid = (isValidNumber>=100 && isValidNumber<=200) || isValidNumber == 0;

        if(!isValid){
            System.out.println("invalid");
        }

    }
}
