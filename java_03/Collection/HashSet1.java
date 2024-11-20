import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] aegs){
        HashSet<String> data = new HashSet<>();
        data.add("Java");
        data.add("PHP");
        data.add("Python");
        data.add("Java");
        data.add("C#");
        data.add("Dart");
        data.add("Assemby");
        
        // data.remove("PHP");

        // data.clear();

        System.out.println(data);
        System.out.println(data.size());
        System.out.println(data.contains("Python"));
    }
}
