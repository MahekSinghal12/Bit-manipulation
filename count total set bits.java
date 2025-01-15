//count total set bits in all numbers from 1 to n

public class count_total_setbit_1to_n {
    public static void main(String[] args) {
        System.out.println(count_set_bit(7));
    }
    static int count_set_bit(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            int data = i;
            while(data!=0){
                if((data&1)==1){
                    count++;
                }
                data=data>>1;
            }
        }
        return count;
    }
}
