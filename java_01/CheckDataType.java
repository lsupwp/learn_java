public class CheckDataType {
    public static void main(String[] args) {
        Integer a = 10;
        double b;
        String c = "Hello";
        boolean d;
        char e;
        float f;

        // เป็น (true) ไม่เป็น (false)
        // boolean c_is_string = a instanceof String; // ต้องกำหนดค่าตัวแปลด้วย (instanceof ทำงานได้แค่กับนิยามเป็นชื่อclass เช่น Integer a = 10)
        boolean a_is_integer = a instanceof Integer;
        System.out.println(a_is_integer);
    }
}
