import java.util.Scanner;
public class TradeComissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());
        double comision = 0;

        if(city.equals("Sofia")){
            if(sales >=0 && sales <=500){
                comision = 0.05;
                System.out.printf("%.2f" ,comision*sales);
            }
            else if(sales>500 && sales<=1000){
                comision = 0.07;
                System.out.printf("%.2f" ,sales * comision);
            }
            else if(sales>=1000 && sales<=10000){
                comision = 0.08;
                System.out.printf("%.2f" ,sales * comision);
            }
            else{
                comision = 0.12;
                System.out.printf("%.2f" ,sales * comision);
            }
        }
        else if(city.equals("Varna")){
            if(sales >=0 && sales <=500){
                comision = 0.045;
                System.out.printf("%.2f" ,sales * comision);
            }
            else if(sales>500 && sales<=1000){
                comision = 0.075;
                System.out.printf("%.2f" ,sales * comision);
            }
            else if(sales>=1000 && sales<=10000){
                comision = 0.10;
                System.out.printf("%.2f" ,sales * comision);
            }
            else {
                comision = 0.13;
                System.out.printf("%.2f" , sales * comision);
            }
        }
        else if(city.equals("Plovdiv")){
            if(sales >=0 && sales <=500){
                comision = 0.055;
                System.out.printf("%.2f" , sales * comision);
            }
            else if(sales>500 && sales<=1000){
                comision = 0.08;
                System.out.printf("%.2f" ,sales * comision);
            }
            else if(sales>=1000 && sales<=10000){
                comision = 0.12;
                System.out.printf("%.2f" ,sales * comision);
            }
            else if(sales>10000){
                comision = 0.145;
                System.out.printf("%.2f", sales * comision);
            }
            else {
                System.out.println("Error");
            }
        }
        else{
            System.out.println("Error");
        }

    }
}
