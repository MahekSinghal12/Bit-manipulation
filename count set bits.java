//count set bits in an integer.

public class count_set_bit {
    public static void main(String[] args) {
        System.out.println(count_set_bit_in_an_integer(5));
    }
    public static int count_set_bit_in_an_integer(int data){
        int count = 0;
        while(data!=0){
            if((data&1)==1){
                count++;
            }
            data=data>>1;
        }
        return count;
    }
}
