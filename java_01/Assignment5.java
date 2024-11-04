import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        /*
            น้อยกว่า 18 =  ต่ำกว่าเกณฑ์
            18.5 - 22.9 = สมส่วน
            23.0 - 24.9 = น้ำหนักเกิน
            25.0 - 29.9 = โรคอ้วน
            มากกว่า 30 = โรคอ้วนระดับอันตราย
        */
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you weight(kg): ");
        float weight = sc.nextFloat();

        System.out.print("Enter you height(cm): ");
        float height = sc.nextFloat();

        height = height / 100;

        float bmi = weight / (height*height);

        if (bmi < 18){
            System.out.println("ต่ำกว่าเกณฑ์");
        }else if (18.5 <= bmi && bmi <= 22.9){
            System.out.println("สมส่วน");
        }else if (23.0 <= bmi && bmi <= 24.9){
            System.out.println("น้ำหนักเกิน");
        }else if (25.0 <= bmi && bmi <= 29.9){
            System.out.println("โรคอ้วน");
        }else if (30 <= bmi && bmi <= 70){
            System.out.println("โรคอ้วนระดับอันตราย");
        }else{
            System.out.println("ไม่ทราบ");
        }
        // System.out.println("You BMI is "+bmi);
    }
}
