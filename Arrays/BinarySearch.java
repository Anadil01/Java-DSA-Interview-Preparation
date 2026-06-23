public class BinarySearch {

    public static int findkey(int numbers[] , int key){
        int start =0,  end = numbers.length-1;
      
        while(start <= end){
            int mid = (start+end)/2;
           if(numbers[mid]==key){
            return mid;
           }
           if(numbers[mid] < key){ // 5 //key =7
              start = mid+1;   // right side
           }else{
             end = mid -1;  // left side
           }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,6,8};
        int key = 3;
       int index =findkey(numbers, key);

       if(index ==-1){
        System.out.print("key is not found");
       }else{
        System.out.print(key +" key is found on index " + index);
       }

    }
}
