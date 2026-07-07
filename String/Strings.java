import java.util.Scanner;

public class Strings {

    public static void PrintLetter(String name){
        for(int i =0; i < name.length(); i++){
            System.out.print(name.charAt(i) + " ");
        }
        // System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {'a', 'b','c'};
        String str = "abc";
        String str2 = new String("abc");


        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.print(name);

        String name = "Anadil";
        System.out.println(name.length());


        //Concatenation

        String firstName = "Anadil";
        String lastName = "Ghosi";
        String fullName = firstName + " " +lastName;
        System.out.print(fullName);
        PrintLetter(fullName);

    }
    
}
