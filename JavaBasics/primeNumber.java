import java.util.*;


public class primeNumber {
    public static void main(String [] args){
        System.out.println("Enter a number:");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

      if(n<2){
        System.out.println(n +"is not prime number");
      }

      boolean  isprime =true;
      for(int i =2 ; i<=Math.sqrt(n);i++){
        if(n%i==0){
            isprime = false;
            break;
        }
      }

      if(isprime ==true){
        System.out.println(n +" is 1 prime number");
      }else{
        System.out.println(n +" is not prime number");
      }
      
    
    }

    
}
