public class TrapingRainWater {

    public static void FindRainWater(int height[]){
     //Left max boundary
    int leftMax [] = new int [height.length];

    leftMax[0] = height[0];

    for(int i =1; i< height.length; i++){
        leftMax[i] = Math.max(height[i] , leftMax[i-1]);

    }
     //right max boundt

     int RightMax [] = new int [height.length];

     RightMax[height.length-1] = height[height.length-1];

for(int i = height.length-2; i >= 0; i--){
    RightMax[i] = Math.max(height[i], RightMax[i+1]);
}
      
     int trappedWater =0;
     for(int i =0; i< height.length; i++){
     int waterlevel = Math.min(leftMax[i], RightMax[i]);
       trappedWater += waterlevel- height[i];
     }

     System.out.print(trappedWater);
     // find minimu between left max nad right max

     // then trapw = minimum - height *width


    }
    public static void main(String[] args) {
        int height [] ={4,2,0,6,3,2,5};
        FindRainWater(height);
    }
}
