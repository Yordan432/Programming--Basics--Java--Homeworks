import java.util.Scanner;
public class AnimalType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String animal = scan.nextLine();

        switch (animal){
            case "dog":
            System.out.println("mammal");
                break;
            case "tortoise":
            case "crocodile":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
