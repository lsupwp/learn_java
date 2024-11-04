import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you weight(kg): ");
        float weight = sc.nextFloat();

        System.out.print("Enter you height(cm): ");
        float height = sc.nextFloat();

        height = height / 100;

        float bmi = weight / (height*height);

        System.out.println("You BMI is "+bmi);

    }
}
