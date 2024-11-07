public class ReturnMethod {
    // ...<var> คล้ายๆกับ *<var> ใน python
    static int sum(int ...numbers){
        int sum = 0;
        for (int number:numbers){
            sum+=number;
        }
        return sum;
    }
    static void print(String text){
        System.out.println(text);
    }
    static String full_name(String f_name, String l_name){
        return f_name + " " + l_name;
    }
    public static void main(String[] args) {
        int result = sum(1,2,3,4,5);
        print("sum = "+result);

        String name = full_name("Nanthapat", "Petshanghan");
        print("My name is "+name);
    }    
}
