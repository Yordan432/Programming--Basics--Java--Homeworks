import java.util.Scanner;

public class p9Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeProjection = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());

        double price = 0;
        if (typeProjection.equals("Premiere")){
            price = 12;
        }else if(typeProjection.equals("Normal")){
            price = 7.50;
        }else if(typeProjection.equals("Discount")){
            price = 5;
        }
        System.out.printf("%.2f leva", row * col * price);
    }
}
