public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.Color);
        p1.setTip(5);
        System.out.println(p1.Tip);

    BankAccount myacc = new BankAccount();
    myacc.username = "Anadil02";
    // myacc.password= "123456";   we cant access it.
    myacc.setPassword("1234567890"); // we can only set the password!

    }
}



class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen{
    String Color;
    int Tip;




void setColor(String newColor){
    Color= newColor;
}

void setTip(int newTip){
    Tip = newTip;
}

}