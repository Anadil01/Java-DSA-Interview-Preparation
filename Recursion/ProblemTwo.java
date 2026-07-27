public class ProblemTwo {
    public static int fact(int n){
        if(n ==1 ){
            return 1;
        }
        return n * fact(n-1);
    }

    public static int SumOfNnaturalNumber(int n){
        if(n==1){
            return 1;
        }
       return n+SumOfNnaturalNumber(n-1);
    }
    public static void main(String[] args) {
        int n= 8;
        // System.out.print("Factorial of " +n+ " is " + fact(n));
        System.out.print(SumOfNnaturalNumber(n));
    }
}
