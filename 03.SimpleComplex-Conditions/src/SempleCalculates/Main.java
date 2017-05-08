package SempleCalculates;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
       double grader = Double.parseDouble(scan.nextLine());

        if(grader >=5.50){
            System.out.println("Excellent!");
        }
        else{
            System.out.println("Not excellent.");
        }
    }
}
