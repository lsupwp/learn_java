public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        int i = 1, j = 1;
        while (i<=5){
            j = 1;
            while (j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
