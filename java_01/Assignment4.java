// แปลง พ.ศ. เป็น ค.ศ.
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter B.E.: ");
        int be = sc.nextInt();

        int ad = be - 543;

        System.out.println("A.D. is " + ad);
    }
}
