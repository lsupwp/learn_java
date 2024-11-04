public class Variable {
    public static void main(String[] args) {
        int num1 = 10;          // ตัวแปลปกติ
        final int NUM2 = 20;    // ค่าคงที่ (ต้องกำหนดค่าเริ่มต้น)

        num1 = 30;
        // NUM2 = 50;      // Variable.java:7: error: cannot assign a value to final variable NUM2

        System.out.println(num1);
        System.out.println(NUM2);
    }
}
