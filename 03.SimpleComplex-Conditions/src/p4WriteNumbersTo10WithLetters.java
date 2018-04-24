import java.util.Scanner;

public class p4WriteNumbersTo10WithLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String result = "";
        if (number == 1){
            result = "one";
        }else if(number == 2){
            result = "two";
        }else if(number == 3){
            result = "three";
        }else if(number == 4){
            result = "four";
        }else if(number == 5){
            result = "five";
        }else if(number == 6){
            result = "six";
        }else if(number == 7){
            result = "seven";
        }else if(number == 8){
            result = "eight";
        }else if(number == 9){
            result = "nine";
        }else if(number == 10){
            result = "ten";
        }

        System.out.println(result);
    }
}

