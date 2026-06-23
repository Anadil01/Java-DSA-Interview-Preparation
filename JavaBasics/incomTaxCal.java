public class incomTaxCal {
    public static void main(String[] args){
        int income = 600000;

        if(income < 500000){
            System.out.println("Your income tax is : 0");
        }else if(income >= 500000 && income < 1000000){
            System.out.println("Your income tax is : " + (income * 0.2));
        }else{
            System.out.println("Your income tax is : " + (income * 0.3));
        }
    }
}
