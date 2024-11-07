public class ParamArrayMethod {
    static void print(String text){
        System.out.println(text);
    }
    static String display_array(int[] numbers){
        String text = "{";
        for (int i = 0; i < numbers.length; i++){
            text+=(" "+numbers[i]);
            if (i < numbers.length -1) text+=",";
        }
        text+=" }";
        return text;
    }
    static int find_max(int[] numbers){
        int max =  numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
    static int find_index(int[] numbers,int target){
        for (int i = 0; i < numbers.length; i++){
            if (target == numbers[i]){
                return i;
            }
        }
        // ถ้าไม่เจอ target จะ return -1
        return -1;
    }
    static Boolean array_equal_array(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            return false;
        }else{
            for (int i = 0; i < arr1.length; i++){
                if (arr1[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        }
    }
    static boolean switch_array_position(int old_position, int new_position, int[] array){
        if ((old_position < array.length && new_position < array.length) && (old_position >= 0 && new_position >= 0)){
            int temp = array[old_position];
            array[old_position] = array[new_position];
            array[new_position] = temp;
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] num1 = {10,20,30,40,50};
        int[] num2 = {20, 50, 30, 45, 55};

        String text_1 = display_array(num1);
        print(text_1);
        int result = find_max(num2);
        String text_2 = display_array(num2);
        print("Max of "+text_2+" is "+result);

        int target = 11;
        int index = find_index(num2, target);
        if (index == -1){
            print(target+" not in "+text_2);
        }else{
            print("Index of 30 in "+text_2+" is "+index);
        }
        int[] num3 = {1,2,3,4,5,6,7, 9};
        int[] num4 = {1,2,3,4,5,6,7};
        String text_3 = display_array(num3);
        String text_4 = display_array(num4);
        boolean is_equal = array_equal_array(num3, num4);
        if (is_equal){
            print(text_3+" equal "+text_4);
        }else{
            print(text_3+" not equal "+text_4);
        }
        print(display_array(num1));
        if(switch_array_position(2, 1, num1)){
            print(display_array(num1));
        }else{
            print("Error index out of range");
        }
        
    }
}
