import java.util.Scanner;

public class TrowAndMethod {

    static int balance = 5_000;

    static void with_draw(int amount) throws Exception{ // throws ExceptionName ต้องมีไม่มีจะไม่โยน Exception ออกมาใช้งาน
        // จำนวนเงินที่ถอน
        if (amount <= 0){
            throw new Exception("กรุณาป้อนเงินมากกว่า 0");
        }if (amount > balance){
            throw new Exception("ยอดเงินคงเหลือไม่พอ");
        }
        balance-=amount;
        System.out.println("ถอนเงินซ "+amount);
        System.out.println("ยอดคงเหลือ: "+balance);
    }
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("จำนวนเงินที่ต้องการ: ");
            int money = sc.nextInt();
            // ถอนเงิน
            with_draw(money);
        }catch(Exception e){
            e.printStackTrace();
        }
    }    
}
