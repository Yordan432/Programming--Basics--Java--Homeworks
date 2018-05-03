import java.util.Scanner;

public class p12GenerateRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minMaxValue = Integer.parseInt(scanner.nextLine());
        int minAreaOfRectangle = Integer.parseInt(scanner.nextLine());

        int count = 0;
        for (int left = -minMaxValue; left <minMaxValue; left++) {
            for (int top = -minMaxValue; top < minMaxValue; top++) {
                for (int right = left + 1; right <=minMaxValue; right++) {
                    for (int bottom = top + 1; bottom <=minMaxValue; bottom++) {
                        int area = Math.abs(right - left) * Math.abs(bottom - top);
                        if (area >=minAreaOfRectangle){
                            System.out.printf("(%s, %s) (%s, %s) -> %s\n", left, top, right, bottom, area);
                            count++;
                        }
                    }
                }
            }
        }
        if (count == 0){
            System.out.println("No");
        }
    }
}
