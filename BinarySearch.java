class BinarySearch {
    public static int bs(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid; // Return the index where the key was found
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // Return -1 to indicate that the key was not found
    }

    public static void main(String args[]) {
        int arr[] = {11, 2, 1, 55, 33};
        int key = 11;
        int res = bs(arr, key);
        if (res != -1) {
            System.out.println("Key Found at index: " + res);
        } else {
            System.out.println("Key Not Found");
        }
    }
}
