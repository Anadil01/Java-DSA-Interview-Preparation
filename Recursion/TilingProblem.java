public class TilingProblem {
    public static int tiling(int n ){

        if(n == 0 || n == 1){
            return 1;
        }

       //Vertical filling
       int fnm1 = tiling(n-1);

       //Horizontal choice

       int fnm2 = tiling(n-2);

       int totalWays = fnm1 + fnm2;
       return totalWays;

    }
    public static void main(String[] args) {
        
    }
}
