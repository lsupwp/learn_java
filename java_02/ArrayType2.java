public class ArrayType2 {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40, 50};

        // เข้าถึงด้วย for loop
        // for (int i = 0; i < numbers.length; i++){
        //     System.out.println("numbers index "+i+" is "+numbers[i]);
        // }

        // for each
        int index = 0;
        for (int n: numbers){
            System.out.println("numbers index "+index+" is "+n);
            index++;
        }
    }
}
