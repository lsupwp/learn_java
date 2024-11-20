package Main_JV;
import mypackage.MyClass;
import utillity.Calculator;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello");
        MyClass.show_name("Bank");
        System.out.println(new Calculator().add(10.0, 27.0));
    }
}
