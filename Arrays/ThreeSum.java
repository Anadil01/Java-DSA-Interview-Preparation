import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {


    static Set<List<Integer>> result = new HashSet<>();

    public static Set<List<Integer>> bruteForce(int nums[]){
        
        for(int i =0; i< nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                for(int k = j+1; k< nums.length; k++){
                  int sum = nums[i] + nums[j] + nums[k];
                    if(sum ==0){
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);

                Collections.sort(triplet);

                  result.add(triplet);
                    }
              
                }
            }
          
        }
        return result;

    }

    public static Set<List<Integer>> betterApproach(int[] nums){
        for (int i = 0; i < nums.length; i++) {

            Set<Integer> seen = new HashSet<>();
        
            for (int j = i + 1; j < nums.length; j++) {
        
                // Find third
                int third = -(nums[i]+nums[j]);
        
                // Check in seen

                if(seen.contains(third)){
                   System.out.print("Triplet Found");
                }
                seen.add(nums[j]);
        
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        bruteForce(nums);
        System.out.print(bruteForce(nums));
    }
}
