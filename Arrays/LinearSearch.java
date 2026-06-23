public class LinearSearch {

    public static int Findkey(int number[] , int key){
    for(int i =0; i <number.length; i++){
        if(number[i] == key){
          return i;
        }
    }
          return -1;
    }
    public static void main(String[] args) {
        int number[] = {1,3,2,4,6,9,10};
        int key =10;
        int index = Findkey(number, key);
       if(index == -1){
        System.out.println("key is not found");
       }else{
        System.out.println(key+" key is found at index "+ index);
       }
    }
}
