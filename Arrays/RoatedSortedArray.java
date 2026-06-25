public class RoatedSortedArray {


    public static int SearchInRoatedSortedArr(int arr[], int target){
        int low =0, high = arr.length-1 ;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[low] <= arr[mid]){  // left half sorted 
                if(arr[low] <= target && target <= arr[mid]){
                    high = mid- 1;
                }else{
                    low = mid+1;
                }
            }else{
                if(arr[mid] <= target && target <= arr[high]){ // right half
                    low = mid+1;
                 }else{
                     high = mid-1;
                 }
            }   

        }
        return -1;

    
    }
    public static void main(String[] args) {
       int arr[] = {4,5,6,7,0,1,2};
       int taget = 0;
       
       System.out.println(SearchInRoatedSortedArr(arr, taget));
    }
}
