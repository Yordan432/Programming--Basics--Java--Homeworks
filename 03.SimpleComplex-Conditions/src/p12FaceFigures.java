import java.util.Scanner;

public class p12FaceFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFigure = scanner.nextLine();

        if (nameFigure.equals("square")){
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println(a * a);
        }else if(nameFigure.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println(a * b);
        }else if(nameFigure.equals("triangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println(a * b / 2);
        }else if(nameFigure.equals("circle")){
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println(Math.PI * a * a);
        }
    }
}
