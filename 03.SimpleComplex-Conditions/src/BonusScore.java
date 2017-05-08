import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        //int result =(int)10.5 % 10;
        //System.out.println(result);
        Scanner scan = new Scanner(System.in);
        double numbers = Double.parseDouble(scan.nextLine());
        double bonusScore = 0;

        if(numbers <=100){
            bonusScore += 5;
        }
        else if(bonusScore<=1000){
            bonusScore += (bonusScore*20) / 100.0;

        }
        else{
            bonusScore += (bonusScore*10) / 100.0;
        }
        if(numbers % 2 == 0){
          bonusScore =  bonusScore + 1;
        }
       else if(bonusScore % 10 == 5){
            bonusScore += 2;
        }
        System.out.println(bonusScore);
        System.out.println(numbers + bonusScore);
    }
}
