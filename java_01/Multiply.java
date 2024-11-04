// สูตรคูณ
import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you number: ");
        int n = sc.nextInt();

        for (int i = 0; i <= 12; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}
