public class Max_SumArr {

    public static int maximumSubarraySum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= n - 1; i++) {
            int currSum = 0;
            for (int j = i; j <= n - 1; j++) {
                currSum += arr[j];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String args[]) {
        // Your code goes here
        int a[] = { 5, 4, -1, 7, 8 };
        System.out.println(maximumSubarraySum(a));
    }

    // Efficient approach

    // public static int maximumSubarraySum(int[] arr) {
    // int n = arr.length;
    // int maxSum = Integer.MIN_VALUE;
    // int currSum = 0;

    // for (int i = 0; i <= n - 1; i++) {
    // currSum += arr[i];

    // if (currSum > maxSum) {
    // maxSum = currSum;
    // }

    // if (currSum < 0) {
    // currSum = 0;
    // }
    // }

    // return maxSum;
}
