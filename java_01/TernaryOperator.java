import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // ตัวแปร = (เงื่อนไข) ? จริง : เท็จ

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you number: ");
        int n = sc.nextInt();

        String result = (n%2 == 0) ? (n + " เป็นเลขคู่") : (n + " เป็นเลขคี่");

        System.out.println(result);
    }
}
