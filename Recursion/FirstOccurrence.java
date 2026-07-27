public class FirstOccurrence {

    public static int FindFirstOccurrence(int arr[] , int index , int key){
     if(index == arr.length -1)
        return -1;
    

    if(arr[index] == key)
        return index;
    

    return FindFirstOccurrence(arr , index +1 , key);
}
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 6, 8};
        int key = 8;
        int indexKey = FindFirstOccurrence(arr, 0, key);
        if(indexKey ==-1){
            System.out.println("The key "+key +" is not Found in the array");
        }else{
            System.out.println("The key " +key+" is Found at index " +indexKey);
        }
        
    }
}
