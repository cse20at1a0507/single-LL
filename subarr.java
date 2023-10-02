public class subarr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int count=0;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                count++;
                System.out.println();
            }
        }
        System.out.println("No Of Sub Arrays :- "+count);
    }
}
/*
Formula=n(n+1)/2 For Total Number Of Sub Arrays
*/