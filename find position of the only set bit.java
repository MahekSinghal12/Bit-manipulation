//find position of the only set bit

public class position_of_set_bit {
    public static void main(String[] args) {
        System.out.println(position(8));
    }
    public static int position(int data){
        int pos=0;
        while(data!=0){
            if((data&1)==1){
                return pos;
            }
            pos++;
            data=data>>1;
        }
        return 0;
}
}
