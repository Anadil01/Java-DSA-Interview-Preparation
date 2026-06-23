public class KadanesAlgo {

    public static void MaxSubArrSum(int n[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
      for(int i =0; i< n.length; i++){
         cs = cs+n[i];

         if(cs < 0){
            cs =0;
         }

         ms = Math.max(cs,ms);
      }
      System.out.print(ms);
    }
    public static void main(String[] args) {
        int n [] = {1,-2,6,-1,3};
        MaxSubArrSum(n);
 
    }
}
