/*  
    Bounded Type Parameter => การกำหนดข้อบังคับหรือขอบเขตในการจัดการประเภทข้อมูลที่อยู่ใน Type Parameter

    // โครงสร้างคำสั่ง
    class ClassName<T extends type>{

    }

    Number => ตัวเลข
*/

import org.w3c.dom.Text;

class Item<T extends Number>{
    T data;
    // create constructure
    public Item(T value){
        this.data = value;
    }
}

public class Generic2 {
    public static void main(String[] args) {
        Item<Integer> obj1 = new Item<>(10);
        System.out.println(obj1.data);

        Item<Float> obj2 = new Item<>(30.5f);
        System.out.println(obj2.data);
    }
}
