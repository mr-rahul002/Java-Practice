import java.util.Scanner;

public class Rever_Arr {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        rev_Arr(a, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }

    private static void rev_Arr(int[] a, int n) {
        int s = 0;
        int e = n - 1;
        int temp;
        while (s < e) {
            temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }
}
