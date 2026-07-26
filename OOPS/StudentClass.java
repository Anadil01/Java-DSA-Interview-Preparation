public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Anadil";
        s1.roll = 456;
        s1.password= "trgvrer";


        Student s2 = new Student(s1);

        
    }
}


class Student{
    String name;
    int roll;
    String password;
    String marks[];

   Student(){
    System.out.println("Constrcter is called!");
   }

    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    Student(String name){
        this.name = name;
    }
}


