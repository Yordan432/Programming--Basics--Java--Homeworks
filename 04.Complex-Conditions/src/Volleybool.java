import java.util.Scanner;
public class Volleybool {

    private static final int weekends = 48;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        int holiday = Integer.parseInt(scan.nextLine());
        int weekendsCity = Integer.parseInt(scan.nextLine());

        double weekenedsSofia = (weekends - weekendsCity) * 0.75;
        double weekendsThierCity = weekends - weekenedsSofia;
        //System.out.println(weekendsThierCity);
       // double holidayOfSofia = weekenedsSofia * 0.75;

        double coutHoliday = (holiday * 2.0) / 3;

        double totalHolidays = weekenedsSofia + weekendsCity + coutHoliday;

       // double leapYear = 0.15 * totalHolidays;
        //double total = totalHolidays + leapYear;

        if(word.equals("normal")){
            System.out.println((int)totalHolidays);
        }
        else if(word.equals("leap")){
            totalHolidays*=1.15;
            System.out.println((int)totalHolidays);
        }

    }
}
