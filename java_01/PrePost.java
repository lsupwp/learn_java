public class PrePost {
    public static void main(String[] args) {
        // (++(Prefix)) ++a เพิ่มค่าให้ a ก่อน 1 แล้วค่อยนำไปใช้
        // (++(Postfix)) a++ นำค่าปัจุบันใน a ไปใช้ก่อนแล้วค่อยเพิ่มค่า
        // (--(Prefix)) --b ลดค่าให้ b ก่อน 1 แล้วค่อยนำไปใช้
        // (--(Postfix)) b-- นำค่าปัจุบันใน b ไปใช้ก่อนแล้วค่อยลดค่า

        int a = 5;
        // pre หน้า
        // post หลัง

        System.out.println(a); // a default

        System.out.println(++a); // a prefix

        System.out.println(a++); // a postfix
        System.out.println(a); // a before post

        int b = 20;

        System.out.println(b); // b default

        System.out.println(--b); // b prefix

        System.out.println(b--); // b postfix
        System.out.println(b); // b before post
    }
}
