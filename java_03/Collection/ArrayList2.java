
/*
    การสร้างArrayList
    import java.util.ArrayList;

    ArrayList<class_name> <var_name> = new ArrayList<>();
*/
import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        ArrayList<String> new_data = new ArrayList<>(List.of("C", "C++", "C#")); // สร้าง Default data ให้ ArrayList
        data.add("JAVA");
        data.add("PHP");
        data.add("Python");
        data.add(1, "SQL"); // แทรกข้อมูล
        data.set(0, "JavaScript");
        data.addAll(0, new_data);

        // data.remove("C++");
        data.remove(4);
        // ลบข้อมูลทั้งหมดใน Array
        // data.clear();

        // มีข้อมูลนี้ไหม
        System.out.println(data.contains("Python"));

        // ดูเลข index ของข้อมูลนั้นๆ | ถ้าค้นไม่เจอจะได้ -1
        System.out.println(data.indexOf("PHP"));
        System.out.println(data);
    }
}
