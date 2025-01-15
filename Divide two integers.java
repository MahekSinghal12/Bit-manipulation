//Divide two integers without using multiplication,division and mod operator

public class sum_of_two_number {
    public static void main(String[] args) {
        System.out.println(sum(4, 5));
    }
    static int sum(int a, int b) {
        int sum = a ^ b;
        int carry = a & b;
        while (carry != 0) {
            a = sum;
            b = carry << 1;
            sum = a ^ b;
            carry = a & b;
        }
        return sum;
    }
}
