import java.util.Scanner;

public class p5BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double bonusScore = 1;
        if (number <= 100){
            bonusScore+=5;
        }else if(number > 100 && number < 1000){
            bonusScore = number * 0.20;
        }else if(number > 1000){
            bonusScore = number * 0.10;
        }

        int lastDigit = number % 10;
        if (number % 2 == 0){
            bonusScore +=1;
        }else if(lastDigit == 5){
            bonusScore +=2;
        }

        System.out.println(bonusScore);
        System.out.println(bonusScore + number);

    }
}
