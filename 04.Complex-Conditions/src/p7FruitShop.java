import java.util.Scanner;

public class p7FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());

        double priceProduct = 0.0;
        if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")){
            if (fruit.equals("banana")){
                priceProduct = 2.70;
            }else if(fruit.equals("apple")){
                priceProduct = 1.25;
            }else if(fruit.equals("orange")){
                priceProduct = 0.90;
            }else if(fruit.equals("grapefruit")){
                priceProduct = 1.60;
            }else if(fruit.equals("kiwi")){
                priceProduct = 3.00;
            }else if(fruit.equals("pineapple")){
                priceProduct = 5.60;
            } else if (fruit.equals("grapes")) {
                priceProduct = 4.20;
            }
        }
        else {
            if (fruit.equals("banana")){
                priceProduct = 2.50;
            }else if(fruit.equals("apple")){
                priceProduct = 1.20;
            }else if(fruit.equals("orange")){
                priceProduct = 0.85;
            }else if(fruit.equals("grapefruit")){
                priceProduct = 1.45;
            }else if(fruit.equals("kiwi")){
                priceProduct = 2.70;
            }else if(fruit.equals("pineapple")){
                priceProduct = 5.50;
            } else if (fruit.equals("grapes")) {
                priceProduct = 3.85;
            }
        }
        if (priceProduct == 0){
            System.out.println("error");
        }else {
            System.out.printf("%.2f", price * priceProduct);
        }
    }
}
