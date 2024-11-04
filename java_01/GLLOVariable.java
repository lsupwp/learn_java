public class GLLOVariable {
    public static void main(String[] args) {
        int a = 10;                                     // global variable
        int b = 20;                                     // global variable
        System.out.println(a);
        {
            int c = 40;                                 // local variable
            System.out.println(c);
            System.out.println("A = "+a);               // เรียกใช้ได้
        }
        // System.out.println(c);                       // cannot find symbol
        System.out.println(b);
    }
}
