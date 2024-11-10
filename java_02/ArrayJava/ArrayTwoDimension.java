public class ArrayTwoDimension {
    public static void main(String[] args) {
        // array 2 มิติ คือ metrix
        /*
            ชนิดข้อมูล[][] ชื่อตัวแปล = {
                {Array ตัวที่1},
                {Array ตัวที่2},
                {Array ตัวที่3}
            }
         */

        String[][] products = {
        //   col 1      col 2       col 3
            {"เก้าอี้",    "โต๊ะ",      "โคมไฟ"},       // row 0
            {"คีย์บอร์ด",  "เมาส์",     "แป้นพิมพ์"},     // row 1
            {"ลิปติก",    "โรออน",    "ครีม"}          // row 2
        };

        // การเข้าถึงข้อมูล แบบอ้างอิงเลข index
        // System.out.println(products[0][1]);     // array[row][col]
        // System.out.println(products[1][2]);

        // products[1][2] = "แผ่นลองเมาส์";

        // System.out.println(products[1][2]);

        // การเข้าถึงข้อมูล โดยใช้ for loop
        for (int i = 0; i < products.length; i++){
            for (int j = 0; j < products[i].length; j++){
                System.out.println("row "+i+" col "+j+" value is "+products[i][j]);
            }
        }
    }
}
