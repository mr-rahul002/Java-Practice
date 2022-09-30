package Sorting;

import java.util.Scanner;

public class SelectionSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection Sorting
        selectonSort(arr, n);
        printArr(arr, n);
        sc.close();
    }

    private static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void selectonSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_ele = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_ele]) {
                    min_ele = j;
                    int temp = arr[min_ele];
                    arr[min_ele] = arr[i];
                    arr[i] = temp;

                }

            }
        }

    }
}
