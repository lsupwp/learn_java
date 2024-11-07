public class ArgsMethod {
    static int sum(int...numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum+=numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5,6};
        System.out.println(sum(num1));

        int[] num2 = {10, 20, 30, 40, 50, 60};
        System.out.println(sum(num2));
    }
}
