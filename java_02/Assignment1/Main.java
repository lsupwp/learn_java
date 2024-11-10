// โปรแกรมตัดเกรด
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        PrintWriter output = null;
        try {
            Scanner input = new Scanner(new File("Score.txt")); // อ่านไฟล์
            output = new PrintWriter(new File("Grade.txt"));

            String data = "";
            String grade = "";
            while(input.hasNext()){
                data = input.nextLine();
                int pos = data.indexOf(" ");
                String score_str = data.substring(pos, data.length());
                score_str = score_str.trim(); // ตัดช่องว่าง
                double score = Double.parseDouble(score_str);
                
                if (score >= 80){
                    grade="A";
                }else if(score >= 70){
                    grade="B";
                }else if(score >= 60){
                    grade="C";
                }else if(score >= 50){
                    grade="D";
                }else{
                    grade="F";
                }
                output.println(data+"   "+grade);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            output.close();
        }
    }    
}
