public class ArrayType1{
    public static void main(String[] args) {
        // array ต้องมีชนิดข้อมูลที่เหมือนกัน
        // ชนิดข้อมูล[] ชื่อตัวแปล = new ชนิดข้อมูล[ขนาด];
        // ชนิดข้อมูล[] ชื่อตัวแปล = {สมาชิก_1, สมาชิก_2, ..., สมาชิก_n};

        // กำหนดขนาด
        // int[] number = new int[10];
        // // กำหนดค่า
        // number[0] = 10;     // ค่าที่ 1
        // number[1] = 20;     // ค่าที่ 2
        // number[2] = 30;     // ค่าที่ 3
        // number[3] = 40;     // ค่าที่ 4
        // number[4] = 50;     // ค่าที่ 5

        // System.out.println("ตำแหน่งที่ 4: "+number[4]);     // ถ้าเข้าถึงตำแน่งที่ยังไม่ได้กำหนดค่า จะมีค่าเท่ากับ 0

        int[] number = {10, 20, 30, 40, 50};
        boolean[] status = {true, false, true, false, false, true};
        String[] fruits = {"papaya", "mango", "water melon"};

        System.out.println("ตำแหน่งที่ 3: "+number[3]);

        number[3] = 100;    // เปลี่ยนค่าสมาชิกใน array

        System.out.println("ตำแหน่งที่ 3: "+number[3]);

        // นับจำนวนสมาชิกใน array
        System.out.println("Length of array number is "+number.length);
        System.out.println("length of array status is "+status.length);
        System.out.println("length of array fruits is "+fruits.length);
    }
}