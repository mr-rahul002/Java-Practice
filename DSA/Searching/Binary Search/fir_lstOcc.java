
import java.util.Arrays;

class fir_lstOcc {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 5, 5, 9, 9 };
        int target = 9;
        int[] ans = new int[2];
        ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    private static int findFirst(int[] nums, int target) {
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] < target)
                s = mid + 1;
            else if (nums[mid] > target)
                e = mid - 1;
            else {
                ans = mid;
                e = mid - 1;
            }
        }
        return ans;
    }

    private static int findLast(int[] nums, int target) {
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] < target)
                s = mid + 1;
            else if (nums[mid] > target)
                e = mid - 1;
            else {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }

    
}


// TOtal number of occur= (last Index- first Index)+1