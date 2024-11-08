import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 2;
            int c = a/b;
            System.out.println(c);

            int[] item = {10, 20, 30, 40};
            // System.out.println(item[100]);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println(number);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Can't devision by zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("index ไม่ถูกต้อง");
        }catch(InputMismatchException e){
            System.out.println(e);
            System.out.println("Enter just integer");
        }catch(Exception e){ // จัดการทุก exception
            System.out.println("Error");
        }finally{ // ทำงานเสมอ
            System.out.println("End Program");
        }
    }
}