import java.util.Scanner;

public class ThrowException {
    /*
        throw => การระบุ Exception case ขึเนมาเอง
        if (age <= 20){
            trow new ExceptionName("Message"); ถ้าไม่รู้รูปแบบของ exception ให้ระบุ ExceptioName เป็น Exception
        }
    */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println(number);
            if (number < 0){
                throw new Exception("ป้อนตัวเลขมากกว่า 0");
            }
        } catch (Exception e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();    // show default exception
        }
    }
}
