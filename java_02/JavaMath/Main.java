import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // PI
        System.out.println(Math.PI);
        // E
        System.out.println(Math.E);
        // ค่าสัมบูรณ์
        int n = -30;
        System.out.println(Math.abs(n));
        // ปัดเศษ
        double n2 = 14.5;
        System.out.println(Math.ceil(n2));  // ปัดขึ้น
        System.out.println(Math.floor(n2)); // ปัดลง

        // <= 0.5 ปัดขึ้น
        // >  0.5  ปัดลง
        System.out.println(Math.rint(15.5));    // ส่งกับเป็นค่าทศนิยม
        System.out.println(Math.rint(15.4));    // ส่งกับเป็นค่าทศนิยม

        // >= .5 ปัดขึ้น
        // <= .4 ปัดลง
        System.out.println(Math.round(15.5));   // ส่งกับเป็นค่าจำนวนเต็ม 
        System.out.println(Math.round(15.4));   // ส่งกับเป็นค่าจำนวนเต็ม

        // หารากที่ 2
        System.out.println(Math.sqrt(9));
        
        // เลขยกกำลัง
        System.out.println(Math.pow(5, 3));
    }    
}
