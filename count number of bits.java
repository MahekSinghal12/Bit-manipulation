//count number of bits to be flipped to convert A to B

public class no_bit_to_be_flipped {
    public static void main(String[] args) {
        System.out.println(number_of_flipped(8,15));
    }
    static int number_of_flipped(int A,int B){
        int count = 0;
        int mask = 1;
        while(A!=B){
            count++;
            A=A>>1;
            B=B>>1;
        }
        return count;
    }
}
