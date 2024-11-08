Exception คือ ข้อผิดพลาดที่เกิดขึ้นจากการทำงานของโปรแกรม
all exception: https://programming.guide/java/list-of-java-exceptions.html

int a = 10;
int b = 0;
System.out.println(a/b); Exception in thread "main" java.lang.ArithmeticException: / by zero

int[] item = {10, 20, 30, 40};
System.out.println(item[6]); Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4

Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: "); (ป้อนตัวอักษรม หรือค่าอื่นๆที่ไม่ใช่ตัวเลข) Exception in thread "main" java.util.InputMismatchException
int number = sc.nextInt();
System.out.println(number);

System.out.println(10*"a"); ExceptionDemo1.java:18: error: bad operand types for binary operator '*'

ArrayIndexOutOfBoundsException ไม่เจอ index นั้นๆ
ArithmeticException เป็นข้อผิดพลาดที่เกิดขึ้นเมื่อเกิดการคำนวณทางคณิตศาสตร์ที่ไม่ถูกต้อง ซึ่งมักเกิดจากการหารด้วยศูนย์
IOException ใน Java เป็นข้อยกเว้น (exception) ที่เกิดขึ้นเมื่อมีปัญหาหรือข้อผิดพลาดเกี่ยวกับการ ป้อนข้อมูลและแสดงผลข้อมูล (input/output) เช่น การอ่านหรือเขียนไฟล์, การสื่อสารผ่านเครือข่าย, หรือการทำงานกับอุปกรณ์ภายนอก เป็นต้น
FileNotFoundException หา file ไม่เจอ

/*
    จัดการ exception โดย
    try{
        statement
    }catch(Exception e){  ไม่ระบุกรณี
        statement
    }

    try{
        statement
    }catch(Exception1 e){
        statement
    }catch(Exception2 e){
        statement
    }
*/
