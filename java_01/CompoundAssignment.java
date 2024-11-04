public class CompoundAssignment {
    public static void main(String[] args) {
        // += | x+=y | x = x+y
        // -= | x-=y | x = x-y
        // *= | x*=y | x = x*y
        // /= | x/=y | x = x/y
        // %= | x%=y | x = x%y

        int x = 20;
        int y = 5;

        System.out.println(x+=y); // 20 + 5
        System.out.println(x-=y); // 25 - 5
        System.out.println(x*=y); // 20 * 5
        System.out.println(x/=y); // 100 / 5
        System.out.println(x%=y); // 20 % 5
    }
}
