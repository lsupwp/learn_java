import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();

        countries.put("TH", "Thailand");
        countries.put("JP", "Japan");
        countries.put("CN", "China");

        // countries.remove("JP");
        // countries.clear();

        System.out.println(countries.containsKey("TH"));
        System.out.println(countries.containsValue("THAI"));

        System.out.println(countries);
        // System.out.println(countries.get("TH"));
        // System.out.println(countries.get("CN"));
        // System.out.println(countries.get("JP"));

        System.out.println(countries.size());
    }
}
