package BitManipulation;

public class OddEven {

    public static void oddAndEven(int n) {
        int bitMask = 1;

        if ((n & bitMask) == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }

    public static void main(String[] args) {
        oddAndEven(12);
        oddAndEven(3);
    }
}