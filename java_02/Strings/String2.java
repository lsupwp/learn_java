public class String2 {
    static void display_array(String[] data){
        String text = "{";
        for (int i = 0; i < data.length; i++){
            text+=(" "+data[i]);
            if (i < data.length -1) text+=",";
        }
        text+=" }";
        System.out.println(text);
    }
    static void display_array(char[] data) {
        String text = "{";
        for (int i = 0; i < data.length; i++) {
            text += (" " + data[i]);
            if (i < data.length - 1) text += ",";
        }
        text += " }";
        System.out.println(text);
    }
    public static void main(String[] args) {
        // แทนที่ข้อความ
        String message = "Happy New Year 2020 and Happy Birth Day 2020";
        System.out.println("Before "+message);
        message = message.replace("2020", "2021"); // เปลี่ยนทุกตัวที่เจอ
        System.out.println("After "+message);

        message = "Happy New Year 2020 and Happy Birth Day 2020";
        System.out.println("Before "+message);
        message = message.replaceFirst("2020", "2021"); // ให้เปลี่ยนเฉพาะตัวแรกที่เจอ
        System.out.println("After "+message);

        // การหั่น string
        String data = "มะม่วง,มะยม,ขนุน";
        String[] fruit = data.split(",");
        String[] text = message.split("and");
        display_array(fruit);
        display_array(text);

        /* ************************************************************* */
        String message2 = "Happy New Year 2020 | Happy Birth Day 2020";
        String[] result = message2.split("|");
        display_array(result);
        /* ************************************************************* */

        // string slicing
        String name = "Nanthapat Petshanghan";
        System.out.println(name.substring(0, 9)); // substring(start, end-1) ไม่มี step
        System.out.println(name.substring(10)); // substring(start, end-1) ไม่มี step

        // แปลง String เป็น char
        String first_name = name.substring(0, 9);
        char[] alphabet = first_name.toCharArray();
        display_array(alphabet);

        // แปลง char เป็น string
        char[] nick_name = {'B', 'a', 'n', 'k'};
        System.out.println(String.copyValueOf(nick_name));

        // ตัดช่องว่าง
        name = " Bank ";
        System.out.println("|"+name+"|"+" to "+"|"+name.trim()+"|");

        // แปลงพิมพ์เล็กเป็นพิมพ์ใหญ่ พิมพ์ใหญ่เป็นพิมพ์เล็ก
        name = "Bank";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // any number to String
        int number = 100;
        System.out.println(String.valueOf(number)+" type is string "+(String.valueOf(number) instanceof String));
    }
}
