package SempleCalculates;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double age = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();

        if(gender.equals("f") && age < 16){
            System.out.println("Miss");
        }
        else if(gender.equals("f") && age >=16){
            System.out.println("Ms.");
        }
        else if(gender.equals("m") && age< 16){
            System.out.println("Master");
        }
        else if(gender.equals("m") && age >=16){
            System.out.println("Mr.");
        }


    }
}
