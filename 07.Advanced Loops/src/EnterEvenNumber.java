import java.util.Scanner;
public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 1;
       do {
           try {
               n = Integer.parseInt(scan.nextLine());
               if(n % 2 != 0){
                   System.out.println("The number is not even.");
               }
               else{
                   break;
               }
           }
           catch (Exception e){
               System.out.println("Invalid number");

           }
       }while (n % 2 !=0);

        System.out.println("Even number entered: " + n);
    }
}
