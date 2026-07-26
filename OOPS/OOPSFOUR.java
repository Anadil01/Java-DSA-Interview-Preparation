public class OOPSFOUR {
    public static void main(String[] args) {  // it is also a static fun
        Student s1 = new Student();
        s1.schoolName = "RK";
        Student s2 = new Student();
        System.out.print(s2.schoolName);
        
    }
}


class Student{
    static int returnPercentage (int math , int phy , int chem){ // function static 
        return (math + phy + chem)/3;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
      this.name = name;
    }
    String getName(){
        return this.name;
    }
} 