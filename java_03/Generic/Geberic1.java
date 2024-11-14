// Generic => รองรับ parameter แบบ dynamic type
/*
    T => Type
    E => Element
    K => Key
    V => Value
    // โครงสร้าง
    class ClassName<T>{

    }

    // การเรียกใช้งาน
    ClassName<CLassType1> objName = new ClassName<>(param);
    ClassName<CLassType2> objName = new ClassName<>(param);
    ClassName<CLassType3> objName = new ClassName<>(param);
    ClassName<CLassType4> objName = new ClassName<>(param);
*/

class Item<T>{
    T data;
    // create constructure
    public Item(T value){
        this.data = value;
    }
}

public class Geberic1 {
    public static void main(String[] args) {
        Item<Integer> obj1 = new Item<>(10);
        System.out.println(obj1.data);

        Item<String> obj12 = new Item<>("Bank");
        System.out.println(obj12.data);

        Item<Float> obj3 = new Item<>(30.5f);
        System.out.println(obj3.data);

        Item<Boolean> obj4 = new Item<>(true);
        System.out.println(obj4.data);
    }
}
