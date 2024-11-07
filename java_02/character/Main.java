public class Main {
    public static void main(String[] args) {
        // default defind
        char aplhabet = 'A';
        char[] group = {'A', 'B', 'C', 'D', 'E'};
        char a = '1';
        char b = 'd';

        // เช็คว่าเป็นตัวอักษรไหม
        System.out.println(Character.isLetter(aplhabet));
        // เป็นตัวเลขไหม
        System.out.println(Character.isDigit(a));
        // เป็นพิมพ์ใหญ่ไหม
        System.out.println(Character.isUpperCase(b));
        // เป็นพิมพ์เล็กไหม
        System.out.println(Character.isLowerCase(b));
        // แปลงเป็นพิมพ์ใหญ่
        System.out.println(Character.toUpperCase(b));
        // แปลงเป็นพิมพ์เล็ก
        System.out.println(Character.toLowerCase(aplhabet));
    }
}
