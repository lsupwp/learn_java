public class String1 {
    public static void main(String[] args) {
        // defind oop style
        String name = new String("Bank");
        // defind default style
        String city = "Kalasin";

        // Concatenation
        System.out.println("My name is "+name+" I live in "+city);
        System.out.println("My name is ".concat(name).concat(" I live in ".concat(city)));

        // หาความยาว string
        System.out.println(name+" มีความยาว "+name.length()+" ตัวอักษร");// รวมพท.ว่างด้วย
        System.out.println(city+" มีความยาว "+city.length()+" ตัวอักษร");// รวมพท.ว่างด้วย

        // หาตำแหน่งตัวอักษร
        int index = 2;
        System.out.println("ตำแหน่งที่ "+index+" คือ "+name.charAt(index));

        // เปรียบเที่ยบ String
        String a = "ABCD";
        String b = "ABCD";
        String c = "WXYZ";
        String d = "abCd";

        System.out.println(a+" เท่ากับ "+b+" ไหม "+a.equals(b)); // นับช่องว่างด้วย สนใจ พิมพ์เล็ก พิมพ์ใหญ่
        System.out.println(a+" เท่ากับ "+c+" ไหม "+a.equals(c)); // นับช่องว่างด้วย สนใจ พิมพ์เล็ก พิมพ์ใหญ่

        System.out.println(a+" เท่ากับ "+d+" ไหม "+a.equalsIgnoreCase(d)); // นับช่องว่างด้วย ไม่สนใจ พิมพ์เล็ก พิมพ์ใหญ่
        System.out.println(a+" เท่ากับ "+c+" ไหม "+a.equalsIgnoreCase(c)); // นับช่องว่างด้วย ไม่สนใจ พิมพ์เล็ก พิมพ์ใหญ่

        // หาว่ามีข้อความนี้อยู่หน้าสุดไหม หรือหลังสุดไหม
        String first_name = "Mr.Nanthapat";
        System.out.println(first_name+"ขึ้นต้นด้วย \"Mr\" ไหม "+first_name.startsWith("Mr")); // สนใจ พิมพ์เล็ก พิมพ์ใหญ่
        System.out.println(first_name+"ขึ้นต้นด้วย \"r\" ไหม "+first_name.startsWith("r")); // สนใจ พิมพ์เล็ก พิมพ์ใหญ่

        System.out.println(first_name+"ลงท้ายด้วย \"pat\" ไหม "+first_name.endsWith("pat")); // สนใจ พิมพ์เล็ก พิมพ์ใหญ่
        System.out.println(first_name+"ลงท้ายด้วย \"Mr.\" ไหม "+first_name.endsWith("r")); // สนใจ พิมพ์เล็ก พิมพ์ใหญ่

        // หาตำแหน่งคำในข้อความ และหาตำแหน่งที่เจอ
        first_name = "Mr.Nanthapat";
        System.out.println("ตำแหน่งของ \"Nan\" อยู่ที่ "+first_name.indexOf("Nan")); // จะนับตำแหน่งของตัวแรก ถ้าหาไม่เจอจะ return -1
        System.out.println("ตำแหน่งของ \"t\" อยู่ที่ "+first_name.indexOf("t")); // จะนับตำแหน่งของตัวแรกที่เจอ ถ้าหาไม่เจอจะ return -1 ออกมา
        System.out.println("ตำแหน่งของ \"Non\" อยู่ที่ "+first_name.indexOf("Non")); // จะนับตำแหน่งของตัวแรก ถ้าหาไม่เจอจะ return -1 ออกมา
    }    
}
