public class Operators {
    public static void main(String[] args) {
        // + บวก
        // - ลบ
        // * คูณ
        // / หาร
        // % หารเอาเศษ

        int a = 30;
        int b = 4;

        System.out.println("ผลบวก: " + (a + b));  // ผลบวกของ a และ b
        System.out.println("ผลลบ: " + (a - b));  // ผลลบของ a และ b
        System.out.println("ผลคูณ: " + (a * b));  // ผลคูณของ a และ b
        System.out.println("ผลหาร: " + ((double)a / (double)b)); // ผลหารของ a และ b
        System.out.println("หารเอาเศษ: " + (a % b));  // ฟารเอาเศษของ a และ b

        // == เท่ากับ
        // > มากกว่า
        // >= มากกว่าเท่ากับ
        // < น้อยกว่า
        // <= น้อยกว่าเท่ากับ

        System.out.println(a+" == " + b + ": "+ (a==b));
        System.out.println(a+" > " + b + ": "+ (a>b));
        System.out.println(a+" >= " + b + ": "+ (a>=b));
        System.out.println(a+" < " + b + ": "+ (a<b));
        System.out.println(a+" <= " + b + ": "+ (a<=b));

        // && and
        // || or
        // ! not

        // ลองเอง
    }
}
