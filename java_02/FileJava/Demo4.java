import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo4 {
    public static void main(String[] args) {
        try {
            FileReader r = new FileReader("Introduction.txt");  // จะได้กลับมาเป็น int เก็บ unicode
            BufferedReader bf = new BufferedReader(r);
            String message = "";
            while((message=bf.readLine())!=null){
                System.out.println(message);
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
