public class reverseNumber {

    public static void main(String [] args){
        int number = 12345;
        int reverseNumber = 0;

        while(number > 0){
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number = number / 10;
           
        }
        System.out.println("The reverse of the number is: " + reverseNumber);
    }
}
