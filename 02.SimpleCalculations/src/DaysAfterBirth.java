import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaysAfterBirth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dates = scan.nextLine();
        DateTimeFormatter date =DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate myDate = LocalDate.parse(dates ,date);
        myDate = myDate.plusDays(999);
        System.out.println(myDate.format(date));

    }
}
