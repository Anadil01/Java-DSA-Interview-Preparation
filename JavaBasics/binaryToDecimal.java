public class binaryToDecimal {

    public static void FindDecimal(int binNumber){
        int pow = 0;
        int dec = 0;

        while(binNumber > 0){
            int lastDigit = binNumber%10;

            dec = dec+(lastDigit *  (int)Math.pow(2,pow));
            
            pow++;
            binNumber= binNumber/10;
        }
        System.out.print(dec);
    }
    public static void main(String[] args) {
        FindDecimal(101);
    }
}
