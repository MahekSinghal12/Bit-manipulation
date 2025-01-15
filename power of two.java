//program to find whether a no is power of two

public class power_of_2 {
    public static void main(String[] args) {
        System.out.println(power_of_two(7));

    }
    public static boolean power_of_two(int n) {
        return (n & (n - 1)) == 0;
    }
}
