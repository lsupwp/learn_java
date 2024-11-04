// โปรแกรมเปรียบเทียบตัวเลข
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter Value of b: ");
        int b = sc.nextInt();

       if (a > b){
        System.out.println("a greater than b");
       }
       else if (a == b){
        System.out.println("a equal b");
       }
       else{
        System.out.println("a lower than b");
       }
    }
}
