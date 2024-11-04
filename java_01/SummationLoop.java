import java.util.Scanner;

public class SummationLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number you want to summation: ");
        float n = sc.nextFloat();
        float sum = 0;
        float mean;

        for (int i = 1; i <= n; i++){
            sum+=i;
        }
        mean = sum / n;
        System.out.println("sum of "+n+" is "+sum);
        System.out.println("mean of "+sum+" is "+mean);
    }
}
