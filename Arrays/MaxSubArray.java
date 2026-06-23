public class MaxSubArray {

    public static void BruteForce(int numbers[]){
     int currsum =0;
     int maxSum = Integer.MIN_VALUE;
    

     for(int i =0; i<numbers.length; i++){
        int start =i;
        for(int j =i; j<numbers.length; j++){
            int end = j;
            currsum= 0;
            for(int k = start; k<= end; k++){
                currsum += numbers[k];
            }
            if(maxSum < currsum){
                maxSum = currsum;
            }
        }
     }
     System.out.println(maxSum);
    }

    public static void PreFixSum(int n[]){
        int currsum = 0;
        int maxSum= Integer.MIN_VALUE;
        int prefix[] = new int [n.length];
        prefix[0] =n[0];
        for(int i =1; i<prefix.length; i++){
          prefix[i] = prefix[i-1] + n[i]; 
        }

        for(int i =0; i<n.length; i++){
            int start =i;
            for(int j =i; j< n.length; j++){
                int end = j;
              currsum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];

              if(maxSum < currsum){
                maxSum = currsum;
              }
            }
        }
        System.out.print(maxSum);
    }
    public static void main(String[] args) {
        // int numbers [] ={2,4,6,8,10};
        // BruteForce(numbers);

        int n [] ={2,4,6,8,10};
        PreFixSum(n);
        
    }
}
