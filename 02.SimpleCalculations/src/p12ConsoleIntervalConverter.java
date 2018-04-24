import java.util.Scanner;

public class p12ConsoleIntervalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        String from = scanner.nextLine().toLowerCase();
        String to = scanner.nextLine().toLowerCase();

        double bgnCursor = 1.79549;
        double euroCursor = 1.95583;
        double gbpCursor = 2.53405;
        if (from.equals("usd"))
        {
            switch (to)
            {
                case "bgn":
                    System.out.printf("%.2f" , sum * bgnCursor);
                    break;
                case "eur":
                    System.out.printf("%.2f" , sum * euroCursor);
                    break;
                case "gbp":
                    System.out.printf("%.2f" , sum * gbpCursor);
                    break;
            }
        }
        else if (from.equals("bgn"))
        {
            switch (to)
            {
                case "usd":
                    System.out.printf("%.2f" , sum / bgnCursor);
                    break;
                case "eur":
                    System.out.printf("%.2f" , sum / euroCursor);
                    break;
                case "gbp":
                    System.out.printf("%.2f" , sum / gbpCursor);
                    break;

            }
        }
        else if(from.equals("eur"))
        {
            switch (to)
            {
                case "bgn":
                    System.out.printf("%.2f" , sum * 2.53405);
                    break;
                case "usd":
                    System.out.printf("%.2f" , sum * 1.08930);
                    break;
                case "gbp":
                    System.out.printf("%.2f" , sum * 0.77181);
                    break;
            }
        }
        else if(from.equals(""))
        {
            switch (to)
            {
                case "bgn":
                    System.out.printf("%.2f" , sum * 0.39462);
                    break;
                case "usd":
                    System.out.printf("%.2f" , sum * 2.53405 / 1.79549);
                    break;
                case "eur":
                    System.out.printf("%.2f" , sum * 0.77181);
                    break;
            }
        }
    }
}
