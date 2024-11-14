/* 
    Generic Mothod => การสร้าง Method ที่สามารถจัดการข้อมูลต่างกันได้

    // โครงสร้างคำสั่ง (void)
    <T>void method_name(T parameter){
        // statement
    }

    // โครงสร้างคำสั่ง (type)
    <T>T method_name(T parameter){
        // statement
    }

    // การเรียกใช้
    Integer data[] = new Integer[]{1,2,3,4,5};
    show_array(data);

    show_array(new Integer[]{1,2,3,4,5});
*/

public class Generic4 {
    static <T> void show_array(T[] array){
        String text = "{";
        for (int i = 0; i<array.length - 1; i++){
            text+=array[i]+", ";
        }
        text+="}";
        System.out.println(text);
    };
    public static void main(String[] args) {
        Integer data[] = new Integer[]{1,2,3,4,5};
        show_array(data);
    }
}
