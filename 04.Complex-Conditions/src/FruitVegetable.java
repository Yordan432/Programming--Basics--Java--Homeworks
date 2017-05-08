import java.util.Scanner;
public class FruitVegetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        if(fruit.equals("apple")
                || fruit.equals("banana")
                || fruit.equals("kiwi")
                || fruit.equals("cherry")
                || fruit.equals("lemon")
                || fruit.equals("grapes")){
            System.out.println("fruit");
        }
        else if(fruit.equals("tomato")
                || fruit.equals("cucumber")
                || fruit.equals("pepper")
                || fruit.equals("carrot")){
            System.out.println("vegetable");
        }
        else{
            System.out.println("unknown");
        }

//•	Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
//•	Всички останали са "unknown"


    }
}
