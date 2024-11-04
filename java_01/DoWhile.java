public class DoWhile {
    public static void main(String[] args) {
        // Do While => ทำ 1 รอบก่อนถ้าเป็นจริงค่อยทำซ้ำจนจะเป็น false
        int count = 1;
        do {
            System.out.println(count);
            count++;
        } while ( count <= 10 );
    }
}
