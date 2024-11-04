public class TypeCasting {
    public static void main(String[] args) {
        // เล็ก => ใหญ่
        int numInt1 = 10;
        double numDouble1 = numInt1;      // แปลง int เป็น double

        System.out.println("numInt1: "+numInt1);
        System.out.println("numDouble1: "+numDouble1);

        // ใหญ่ => เล็ก
        double numDouble2 = 20.0;
        int numInt2 = (int)numDouble2;

        System.out.println("numDouble2: "+numDouble2);
        System.out.println("numInt2: "+numInt2);

    }
}
