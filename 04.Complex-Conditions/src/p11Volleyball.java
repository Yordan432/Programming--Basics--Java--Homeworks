import java.util.Scanner;

public class p11Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeYear = scanner.nextLine();
        int numberOfHolidays = Integer.parseInt(scanner.nextLine());
        int numberOfWeekends = Integer.parseInt(scanner.nextLine());

        int numberWeekends = 48;

        int remainderWeekends = numberWeekends - numberOfWeekends;
        double gamesInHomeTown = numberWeekends - remainderWeekends;
        double gameInSofia = remainderWeekends * 3 /4.0;
        double holidays = numberOfHolidays * 2/3.0;

        double totalGamesHomeTown = gameInSofia +gamesInHomeTown + holidays;
        if (typeYear.equals("leap")){
            double profit = 0.15 * totalGamesHomeTown;
            double totalGamesYear = Math.floor(totalGamesHomeTown + profit);
            System.out.println((int)totalGamesYear);
        }
        else {
            System.out.println((int)totalGamesHomeTown);
        }
    }
}
