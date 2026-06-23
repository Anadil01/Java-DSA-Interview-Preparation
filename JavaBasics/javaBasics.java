import java.util.*;


public class javaBasics {
    public static void main(String [] args){
       int age = 2;

      if(age >= 18){
        System.out.println("You are an adult.");
      }
     else if(age >= 13 && age < 18){
        System.out.println("You are a teenager.");
      }else{
        System.out.println("You are a child.");
      }
}
}