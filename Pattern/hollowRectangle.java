public class hollowRectangle {
    public static void main(String[] args) {
        int totRow = 4;
        int totCol =5;

        for(int i =1; i<=totRow; i++){
            for(int j =1; j<=totCol; j++){
                if(i ==1 || j==1 || i==totRow || j==totCol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
