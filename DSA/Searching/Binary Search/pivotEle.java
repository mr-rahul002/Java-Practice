
/**
 * Find Pivot in an Sorted & Rotated Array using Binary Search
 */

public class pivotEle {

    static int getPivot(int arr[], int n) {

        int s = 0;
        int e = n - 1;
        int mid = s + (e - s) / 2;

        while (s < e) {

            if (arr[mid] >= arr[0]) {
                s = mid + 1;
            } else {
                e = mid;
            }
            mid = s + (e - s) / 2;
        }
        return s;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 8, 10, 17, 1 };
        int n = arr.length;
        int res = getPivot(arr, n);
        System.out.println(res);
    }
}