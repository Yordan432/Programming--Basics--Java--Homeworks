import java.util.Scanner;
public class p7ConvertUnit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        double mm = 1000;
        double cm = 100;
        double mi = 0.000621371192;
        double inch = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;
        double m = 1.0;

        if (input.equals("mm")){ number /= mm; }
        else if(input.equals("cm")){  number /= cm;}
        else if(input.equals("mi")){ number /= mi;}
        else if(input.equals("in")){ number /= inch;}
        else if(input.equals("km")){ number /= km;}
        else if(input.equals("ft")){ number /= ft;}
        else if(input.equals("yd")){ number /= yd;}
        else if (input.equals("m")) { number /= m; }

        if (output.equals("mm")){number *= mm;}
        else if(output.equals("cm")){number *= cm;}
        else if(output.equals("mi")){number *= mi;}
        else if(output.equals("in")){number *= inch;}
        else if(output.equals("km")){number *= km;}
        else if(output.equals("ft")){ number *= ft;}
        else if(output.equals("yd")){number *= yd;}
        else if (output.equals("m")) { number *= m; }

        System.out.printf("%s %s" , number , output);
    }
}
