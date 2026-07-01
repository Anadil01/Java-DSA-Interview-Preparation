public class DiagonalSum {

    public static int FindDiagonalSum(int matrix[][]){
        int sum =0;
        int n = matrix.length;
        for(int i =0; i < n; i++){
            //primary sum 

            sum+= matrix[i][i];

            //secondary

            if(i!= n-1-i){
                sum+=matrix[i][n-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        FindDiagonalSum(matrix);
        System.out.print(FindDiagonalSum(matrix));
    }
}
