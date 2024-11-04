import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // รับค่าข้อมูล ใช้ class scanner
        // ข้อมูลแบบไหน ? ตัวเลข integer, float, long, double, ข้อความ string
        // ข้อความทำอะไร
        // ข้อความแบบตัวเลข => คำนวณได้ | คำนวณไม่ได้

        // ประกาศใข้งาน class | new
        Scanner sc = new Scanner(System.in);

        // ลอง run ดูทั้ง2
        /*******************************************************************************************/
        // System.out.print("Enter your name: ");
        // String name = sc.nextLine();        // nextLine() => รับค่า String จากแป้นพิมพ์

        System.out.print("Enter your name: ");
        String name = sc.next();            // next() => รับค่า String จากแป้นพิมพ์ ถ้ามีค่าว่างจะไม่อ่าน
        sc.nextLine();                      // ไม่มีมันจะบัค
        /*******************************************************************************************/
    
        System.out.print("Enter your birthday year: ");
        int year = sc.nextInt();
        sc.nextLine();                      // ไม่มีมันจะบัค

        int age = 2024 - year;

        System.out.print("Enter your birthday day: ");
        String day = sc.nextLine();
        
        System.out.println("Name: "+name);
        System.out.println("Year: "+year);
        System.out.println("Day: "+day);
    }
}
