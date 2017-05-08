import java.util.Scanner;
public class PointRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());

        double x2 = Double.parseDouble(scan.nextLine());
        double y2= Double.parseDouble(scan.nextLine());

        boolean isInX = x >=x1
                && x<=x2;
        boolean isInY = y >=y1
                && y<=y2;

        if(isInX && isInY){
               System.out.println("Inside");
           }else{
               System.out.println("Outside");
           }


    }
}
