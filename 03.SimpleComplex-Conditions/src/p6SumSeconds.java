import com.sun.deploy.util.StringUtils;

import java.util.Scanner;
public class p6SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int mins = 0;
        int totalSeconds = first + second + third;

        if (totalSeconds < 59){
            mins = 0;
        }else if(totalSeconds > 60 && totalSeconds <119){
            mins = 1;
            totalSeconds = first + second + third - 60;
        }else if(totalSeconds > 120 && totalSeconds < 179){
            mins = 2;
            totalSeconds = first + second + third - 120;
        }

        if(totalSeconds < 10){
            System.out.printf("%s:0%s" , mins, totalSeconds);
        }else {
            System.out.printf("%s:%s", mins, totalSeconds);
        }
    }
}
