import java.io.BufferedWriter;
import java.io.FileWriter;

// BufferedWriter => เขียนไฟล์ขนาดใหญ่ได้เร็วกว่า FileWriter
public class FileDemo3 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Introduction.txt"); // add mode | mode w in python
            BufferedWriter bf = new BufferedWriter(writer);
            bf.write("Hello\n");
            bf.write("Write basic java programing language\n");
            bf.write("Teact by kongrak");
            System.out.println("Finish write file");
            bf.close(); // ปิดไฟล์เสมอ
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
