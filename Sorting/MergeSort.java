public class MergeSort {

    public static void MergeSort(int arr[] , int si , int ei){

        //Base Case

        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;

        //Left Half
        MergeSort(arr, si, mid);

        //Right Half
        MergeSort(arr, mid+1, ei);
       
       // Merge Both
        Merge(arr , si , mid , ei);
    }

    public static void Merge(int arr [] , int si , int mid , int ei){
        int temp [] = new int [ei - si +1];

        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0;  // iterator for tem arr

        while(i <= mid && j<=ei ){
            if(arr[i] <= arr[j]){  // for Left
                temp[k] = arr[i];
                i++;
            }else{   // For Right
               temp[k] = arr[j];
               j++;
            }
            k++;
        }

        while(i <= mid){ //left part remain element
           temp[k++] = arr[i++];
        }
        while(j <= ei){  //Right
          temp[k++] = arr[j++];
        }

        //cpoy temp to org arr

        for(k =0 , i=si; k< temp.length; k++ , i++){
            arr[i] = temp[k];
        }
    }

    public static void printArr(int arr[]){
     for(int i =0; i< arr.length; i++){
        System.out.print(" " +arr[i]);
     }
    }

    public static void main(String[] args) {

    int arr[] = {6,3,9,5,2,8};
    int si = 0;
    int ei = arr.length-1;
      MergeSort(arr , si , ei);  
      printArr(arr);
    }
}