public class NthFibonacci {

    public static int printFibonacciNumber(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
    return (printFibonacciNumber(n-1) + printFibonacciNumber(n-2));
    }
    public static void main(String[] args) {
        int n = 6;

        System.out.println("The Fibonacci number at index " + n + " is: " + printFibonacciNumber(n));
    }
}
