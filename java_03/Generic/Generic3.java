/*  
    Multiple Type Parameter

    T => ประเภทข้อมูลตัวที่ 1
    U => ประเภทข้อมูลตัวที่ 2
    // โครงสร้างคำสั่ง
    class ClassName<T, U>{

    }

    Number => ตัวเลข
*/

class Person<T extends String,U extends Integer>{
    T name;
    U age;
    public Person(T name, U age){
        this.name = name;
        this.age = age;
    }

    public void show_data(){
        System.out.printf("Name: %s, Age: %d\n", this.name, this.age);
    }
}

class Product<T extends String,U extends Number>{
    T name;
    U price;
    public Product(T name, U price){
        this.name = name;
        this.price = price;
    }

    public void show_data(){
        System.out.printf("Name: %s, Price: %.2f\n", this.name, this.price);
    }
}

public class Generic3 {
    public static void main(String[] args) {
        Person<String, Integer> obj1 = new Person<>("Bank", 18);
        obj1.show_data();

        Product<String, Double> product1 = new Product("เมาส์", 359.5);
        product1.show_data();
    }
}
