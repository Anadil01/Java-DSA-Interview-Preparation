public class LastOccurrence {
    static int lastOccurrence(int[] arr, int index, int key) {

        // Base Case
        if (index == arr.length)
            return -1;

        // Search in remaining array
        int foundIndex = lastOccurrence(arr, index + 1, key);

        // If found later, return it
        if (foundIndex != -1)
            return foundIndex;

        // Otherwise check current element
        if (arr[index] == key)
            return index;

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 6, 8};

        System.out.println(lastOccurrence(arr, 0, 8));

    }
}
