// method การเขียนโปรแกรมแบบอื่นเรียกว่า function ในการเขียนแบบ oop เรียกว่า method
/*
    method stucture
    type name (parameter1, parameter2, ...){
        statement;
    }

    ถ้าไม่มีการ return จะระบุ type เป็น void

    access_modifier type name (parameter1, parameter2, ...){
        statement;
    }
*/
public class Method1 {
    // ถ้าไม่ set access_modifier ค่าเริ่มต้นจะเป็น potected
    // ต้องมี static ด้วย
    static void print(String text){
        System.out.print(text);
    }
    static void plus(int a, int b){
        System.out.println(a + " + " + b + " = " + (a+b));
    }
    public static void main(String[] args) {
        print("Hello");
        print(" World\n");
        plus(10, 20);
    }
}
