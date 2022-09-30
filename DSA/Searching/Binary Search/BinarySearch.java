
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int res = binarySearch(a, k);
        if (res == -1)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + res);
        sc.close();

    }

    public static int binarySearch(int[] a, int k) {
        int start = 0;
        int end = a.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (a[mid] == k) {
                return mid;
            }
            if (a[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }
}
