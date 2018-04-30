import java.util.Scanner;

public class p9SumVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i <text.length(); i++) {
            char alhabet = text.charAt(i);
            if (alhabet == 'a'){
                sum +=1;
            }else if(alhabet == 'e'){
                sum +=2;
            }else if(alhabet == 'i'){
                sum += 3;
            }else if(alhabet == 'o'){
                sum +=4;
            }else if(alhabet == 'u'){
                sum +=5;
            }
        }
        System.out.println(sum);
    }
}
