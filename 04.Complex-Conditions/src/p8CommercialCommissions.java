import java.util.Scanner;

public class p8CommercialCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double saless = Double.parseDouble(scanner.nextLine());

        double commission = 0;

        if (town.equals("Sofia")){
            if (saless >= 0 && saless <=500){
                commission = 0.05;
            }else if(saless > 500 && saless <= 1000){
                commission = 0.07;
            }else if(saless > 1000 && saless <= 10000){
                commission = 0.08;
            }else if(saless > 10000){
                commission = 0.12;
            }
        }else if(town.equals("Varna")){
            if (saless >= 0 && saless <=500){
                commission = 0.45;
            }else if(saless > 500 && saless <= 1000){
                commission = 0.75;
            }else if(saless > 1000 && saless <= 10000){
                commission = 0.10;
            }else if(saless > 10000){
                commission = 0.13;
            }
        }
        else if(town.equals("Plovdiv")){
            if (saless >= 0 && saless <=500){
                commission = 0.055;
            }else if(saless > 500 && saless <= 1000){
                commission = 0.08;
            }else if(saless > 1000 && saless <= 10000){
                commission = 0.012;
            }else if(saless > 10000){
                commission = 0.145;
            }
        }
        if (commission <= 0){
            System.out.println("error");
        }else {
            System.out.printf("%.2f",saless * commission);
        }
    }
}
