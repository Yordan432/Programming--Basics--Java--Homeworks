import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class p5DateAfter5Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());

        int dayInMonth = 31;
        if (month == 2){
            dayInMonth = 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 1){
            dayInMonth = 30;
        }

        day+=5;
        if (day > dayInMonth){
            day-=dayInMonth;
            month++;

            if (month > 12){
                month = 1;
            }
        }
        System.out.printf("%d.%02d", day , month);
    }
}
