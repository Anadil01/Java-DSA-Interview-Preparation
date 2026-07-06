public class SingleNumber {

    public static int SingleNumber(int nums[]){
        int ans =0;

        for(int num:nums){
            ans = ans ^ num;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        System.out.print(SingleNumber(nums));
    }
}
