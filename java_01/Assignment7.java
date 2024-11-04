import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("F to C (Enter C) or C to F (Enter F): ");
        
        String var = sc.nextLine();

        if (var.equals("C") || var.equals("c")){
            System.out.print("Enter fahrenheit: ");
            float temp_f = sc.nextFloat();
            float temp_c = (temp_f - 32) * 5 / 9;
            System.out.println(temp_c);
        }else if (var.equals("F") || var.equals("f")){
            System.out.print("Enter celsius: ");
            float temp_c = sc.nextFloat();
            float temp_f = (temp_c * 9 / 5) + 32;
            System.out.println(temp_f);
        }else {
            System.out.println("error");
        }
    }
}
