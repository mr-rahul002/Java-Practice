import java.util.ArrayList;
import java.util.Scanner;

public class SearchedRotate {

    public static int getPivot(ArrayList<Integer> arr, int n) {

        int s = 0;
        int e = n - 1;
        int mid = s + (e - s) / 2;

        while (s < e) {

            if (arr.get(mid) >= arr.get(0)) {
                s = mid + 1;
            } else {
                e = mid;
            }
            mid = s + (e - s) / 2;
        }
        return s;
    }

    public static int binarySearch(ArrayList<Integer> a, int s, int e, int k) {
        int start = s;
        int end = e;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (a.get(mid) == k) {
                return mid;
            }
            if (a.get(mid) > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }

    public static int findPosition(ArrayList<Integer> a, int n, int k) {
        // Write your code here.
        int pivot = getPivot(a, n);
        if (k >= a.get(pivot) && k <= a.get(n - 1)) {
            return binarySearch(a, pivot, n - 1, k);
        } else
            return binarySearch(a, 0, pivot - 1, k);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<Integer>();
        while (sc.hasNextInt())
            a.add(sc.nextInt());

        System.out.println(a);
        int n = a.size();
        System.out.println(n);
        System.out.println("Enter the value of k");
        int k = sc.nextInt();

        findPosition(a, n, k);

        sc.close();

    }

}