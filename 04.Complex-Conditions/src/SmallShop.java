import java.util.Scanner;
public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String city = scan.nextLine();
        double quanity = Double.parseDouble(scan.nextLine());

        if(product.equals("coffee")){
            if(city.equals("Sofia")){
                System.out.println(quanity * 0.50);
            }
            else if(city.equals("Plovdiv")){
                System.out.println(quanity * 0.40);
            }
            else if(city.equals("Varna")){
                System.out.println(quanity * 0.45);
            }
        }
        else if(product.equals("water")){
            if(city.equals("Sofia")){
                System.out.println(quanity * 0.80);
            }
            else if(city.equals("Plovdiv")){
                System.out.println(quanity * 0.70);
            }
            else if(city.equals("Varna")){
                System.out.println(quanity * 0.70);
            }
        }
        else if(product.equals("beer")){
            if(city.equals("Sofia")){
                System.out.println(quanity * 1.20);
            }
            else if(city.equals("Plovdiv")){
                System.out.println(quanity * 1.15);
            }
            else if(city.equals("Varna")){
                System.out.println(quanity * 1.10);
            }
        }
        else if(product.equals("sweets")){
            if(city.equals("Sofia")){
                System.out.println(quanity * 1.45);
            }
            else if(city.equals("Plovdiv")){
                System.out.println(quanity * 1.30);
            }
            else if(city.equals("Varna")){
                System.out.println(quanity * 1.35);
            }
        }
        else {
            if(city.equals("Sofia")){
                System.out.println(quanity * 1.60);
            }
            else if(city.equals("Plovdiv")){
                System.out.println(quanity * 1.50);
            }
            else if(city.equals("Varna")){
                System.out.println(quanity * 1.55);
            }
        }

    }
}
