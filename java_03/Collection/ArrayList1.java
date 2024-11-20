/*
    การสร้างArrayList
    import java.util.ArrayList;

    ArrayList<class_name> <var_name> = new ArrayList<>();
*/
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
	ArrayList<String>  data = new ArrayList<>();
  	data.add("JAVA");
	data.add("PHP");
	data.add("Python");
	data.add("C++");
	data.add(1, "SQL"); // แทรกข้อมูล
	System.out.println(data);
	System.out.println(data.size()); // ดูขนาดของ Array
	System.out.println(data.get(2)); // เข้าถึงข้อมูลแบบเลข index
	
    }   
}
