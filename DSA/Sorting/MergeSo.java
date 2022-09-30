package Sorting;

public class MergeSo {
    public static void main(String[] args) {

        int arr[] = new int[] { 2, 4, 6 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        int arr1[] = new int[] { 1, 3, 5, 7, 9 };
        int m = arr1.length;
        for (int i = 0; i < m; i++) {
            System.out.print(arr1[i] + " ");
        }

        int arr2[] = new int[n + m];

        mergeSortedArr(arr1, m, arr, n, arr2);
    }

    public static void mergeSortedArr(int arr1[], int n, int arr2[], int m, int arr3[]) {
        int i = 0, j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        // copy first array k element ko
        while (i < n) {
            arr3[k++] = arr1[i++];
        }

        // copy kardo second array k remaining element ko
        while (j < m) {
            arr3[k++] = arr2[j++];
        }

        System.out.println();
        System.out.println("from mergeSortedArr method");
        // printing array
        for (int ele : arr3) {
            System.out.print(ele + " ");
        }
    }
}