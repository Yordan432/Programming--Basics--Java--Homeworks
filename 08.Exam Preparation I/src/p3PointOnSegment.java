import java.util.Scanner;

public class p3PointOnSegment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int point = Integer.parseInt(scanner.nextLine());

        int min = Math.min(first, second);
        int max = Math.max(first, second);
        int distanceLeft = Math.abs(min - point);
        int distanceRight = Math.abs(max - point);
        int distance = Math.min(distanceLeft, distanceRight);
        if(point >=min && point <=max){
            System.out.println("in");
        }else {
            System.out.println("out");
        }
        System.out.println(distance);
    }
}
