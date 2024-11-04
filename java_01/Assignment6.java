// แลกธนบัตร
// ประกอบด้วย => 1000, 500, 100, 50, 20
import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        int one_thousand = 0;
        int five_hundred = 0;
        int one_hundred = 0;
        int fifty = 0;
        int twenty = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you money: ");
        int money = sc.nextInt();

        one_thousand = money / 1_000;
        money-=(1_000*one_thousand);
        
        five_hundred = money / 500;
        money-=(500*five_hundred);

        one_hundred = money / 100;
        money-=(100*one_hundred);

        fifty = money / 50;
        money-=(50*fifty);

        twenty = money / 20;
        money-=(20*twenty);

        if (one_thousand != 0){
            System.out.println("แบงค์ 1000 "+ one_thousand + " ใบ");
        }
        if (five_hundred != 0){
            System.out.println("แบงค์ 500 "+ five_hundred + " ใบ");
        }
        if (one_hundred != 0){
            System.out.println("แบงค์ 100 "+ one_hundred + " ใบ");
        }
        if (fifty != 0){
            System.out.println("แบงค์ 50 "+ fifty + " ใบ");
        }
        if (twenty != 0){
            System.out.println("แบงค์ 20 "+ twenty + " ใบ");
        }
        if (money != 0){
            System.out.println("เศษ " + money + " บาท");
        }
    }
}
