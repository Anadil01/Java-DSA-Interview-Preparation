import java.util.*;


public class storeMarks{
    public static void Array(){

    int marks[] = new int [100];
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your marks:");
    marks[0]= sc.nextInt();
    marks[1] = sc.nextInt();
    marks[3] = sc.nextInt();

    System.out.println("math: " + marks[0]);
    System.out.println("phy: " + marks[1]);
    System.out.println("chem: " + marks[2]);

    }
    public static void main(String[] args) {
        Array();
    }
}