import java.util.Scanner;

public class javaBasics {
    public static void main (String [] args){

        // Scanner sc = new Scanner (System.in);

        // System.out.println("Enter first number: ");
        // int num1 = sc.nextInt();

        // System.out.println("Enter second number: ");
        // int num2 = sc.nextInt();

        // System.out.println("Addition :" + (num1 + num2));
        // System.out.println("Sub :" + (num1 - num2));
        // System.out.println("Divion :" + (num1 / num2));
        // System.out.println("Multiply :" + (num1 * num2));
        // System.out.println("Modular :" + (num1 % num2));

        int a =10;
        int b = a++;
        System.out.println("a: " + a); //11 then change hoga 
        System.out.println("b: " + b);  // pehle a ki value b me store hogi 10

        int c = 10;
        int d = ++c;
        System.out.println("c: " + c);  // 11 then change hoga 
        System.out.println("d: " + d);  // then d me  c ki value store hogi 11

    }

}

