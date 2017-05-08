import java.util.Scanner;

public class MagazinFruit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quanity = Double.parseDouble(scan.nextLine());

        boolean IsOfDayWeek = day.equals("Monday")
                || day.equals("Tuesday")
                || day.equals("Wednesday")
                || day.equals("Thursday")
                || day.equals("Friday");

        boolean IsOfWeekends = day.equals("Sunday")
                || day.equals("Saturday");

        if (IsOfDayWeek) {
            if (fruit.equals("banana"))
                System.out.println(quanity * 2.50);
            else if (fruit.equals("apple"))
                System.out.println(quanity * 1.20);
            else if (fruit.equals("orange"))
                System.out.println(quanity * 0.85);
            else if (fruit.equals("grapefruit"))
                System.out.println(quanity * 1.45);
            else if (fruit.equals("kiwi"))
                System.out.println(quanity * 2.70);
            else if (fruit.equals("pineapple"))
                System.out.println(quanity * 5.50);
            else if (fruit.equals("grapes"))
                System.out.println(quanity * 3.85);
            else{
                System.out.println("Error");
            }
        }
        else if(IsOfWeekends){
            if(fruit.equals("banana"))
                System.out.println(quanity * 2.70);
            else if(fruit.equals("apple"))
                System.out.println(quanity * 1.25);
            else if(fruit.equals("orange"))
                System.out.println(quanity * 0.90);
            else if(fruit.equals("grapefruit"))
                System.out.println(quanity * 1.60);
            else if(fruit.equals("kiwi"))
                System.out.println(quanity * 3.00);
            else if(fruit.equals("pineapple"))
                System.out.println(quanity * 5.60);
            else if(fruit.equals("grapes"))
                System.out.println(quanity * 4.20);
            else{
                System.out.println("Error");
            }
        }
        else{
            System.out.println("Error");
        }
    }
}
