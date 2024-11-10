import java.io.*;

public class FileDemo2 {
    public static void main(String[] args) {
        
        try {
            FileReader r = new FileReader("Demo.txt");  // จะได้กลับมาเป็น int เก็บ unicode
            int data;
            while((data = r.read()) != -1){
                System.out.printf("%c",data); // ต้องใช้ format string เพื่อ format ตัวอักสอนออกมา
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
