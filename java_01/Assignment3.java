// เช็คเลขคู่ เลขคี่

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        if (n % 2 == 0){
            System.out.println(n + " เป็นเลขคู่");
        }else{
            System.out.println(n + " เป็นเลขคี่");
        }
    }
}
