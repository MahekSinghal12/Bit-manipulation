//Calculate square of a number without using *,/ and pow()

public class square_of_number_without_mul {
    public static void main(String[] args) {
        System.out.println(square(-5));
    }
    static int square(int n) {
        n = Math.abs(n);
        int data = n;
        int i = 0;
        int res = 0;
        while (data != 0) {
            if ((data & 1) == 1) {
                res += n << i;
            }
            i++;
            data = data >> 1;
        }
        return res;
    }
}
