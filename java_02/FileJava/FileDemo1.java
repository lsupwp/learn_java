import java.io.*;

public class FileDemo1 {
    public static void main(String[] args) {
        File f = new File("Demo.txt"); // File f = new File(<filepath>); | with open("filepath", "mode") as f: | จะยังไม่สร้าง file
        try {
            FileWriter writer = new FileWriter(f); // add mode | mode w in python
            writer.write("Hello World 123");
            System.out.println("Finish write file");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}