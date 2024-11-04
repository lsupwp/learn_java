public class IntoString {
    public static void main(String[] args) {
        /* 
        Strint คือ ชนิดข้อมูลที่เก็บชุดข้อความ
        symbol = ""

        char เก็บตัวอักษร
        symbol = ''

        char เรียงต่อกัน => String
        */

        // char a = 'ABC';     // error: unclosed character literal
        String a = "100", b = "200";

        // a = a+b;                         // ข้อความมาต่อกัน
        int c = Integer.parseInt(a) + 50;   // Integer.parseInt(a) แปลง str => int

        System.out.println("String a : "+a);
        System.out.println("String b : "+b);
        System.out.println("Integer c : "+c);

        // str => double
        System.out.println("Double a : "+Double.parseDouble(a));

        // int => str
        int num1 = 30;
        String age = String.valueOf(num1);
        System.out.println(age);
    }
}
