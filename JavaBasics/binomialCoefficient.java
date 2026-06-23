public class binomialCoefficient {
    public static int Find_Factorial(int n){
      int fact = 1;
      for(int i=1; i<=n; i++){
        fact = fact*i;
        
      }
      return fact;
    }
    public static int findBinomial(int n, int r){
        int n_fact = Find_Factorial(n);
        int r_fact = Find_Factorial(r);
        int nmr_fact = Find_Factorial(n-r);
        int bc = n_fact/(r_fact*nmr_fact);
        return bc;
        
    }
    public static void main(String[] args) {
        System.out.println(findBinomial(5, 2));
    }
    
}
