public class decimalToBinary {
    public static void FindDecimalToBinary(int dec){
    int pow =0;
    int bin = 0;

    while(dec > 0){
        int rem = dec %2 ;
        bin = bin+ rem * (int)Math.pow(10 , pow);

        pow++;
        dec = dec/2;
    }
    System.out.println(bin);
    }
    public static void main(String[] args) {
        FindDecimalToBinary(5);
    }
}
