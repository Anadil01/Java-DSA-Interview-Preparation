import java.util.Scanner;

public class calculater {
    public static void main(String[] args){
     System.out.println("Enter first number: ");
     Scanner sc = new Scanner(System.in);
     int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);


        switch(operator){
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case '/':
                if(num2 != 0){
                    System.out.println("Division: " + (num1 / num2));
                }else{
                    System.out.println("Error: Division by zero is not allowed.");  
        }
                break;
            default:
                System.out.println("Invalid operator.");
        }   

    }
    
}
