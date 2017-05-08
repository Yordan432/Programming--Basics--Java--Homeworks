import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Program = scan.nextLine();
        int row = Integer.parseInt(scan.nextLine());
        int col = Integer.parseInt(scan.nextLine());

        switch (Program){
            case "Premiere":
                System.out.printf("%.2f" ,row * col * 12.0);
                break;
            case "Normal":
                System.out.printf("%.2f" ,row * col * 7.50);
                break;
            case "Discount":
                System.out.printf("%.2f" ,row * col * 5.00);
        }
    }
}
