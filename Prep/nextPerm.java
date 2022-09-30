import java.util.Scanner;

class nextPerm {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
      nextPermutation(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
    public static void nextPermutation(int[] nums) {
    int i=0,len=nums.length;
    
        for(i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1]) break;
        }
        
        if(i<0)
        {
            reverse(0,len-1,nums);
            return;
        }
        //System.out.println(i);
        for(int k=len-1;k>i;k--)
        {
            if(nums[k]>nums[i])
            {
                int n=nums[i];
                nums[i]=nums[k];
                nums[k]=n;
                break;
            }
        }
        //System.out.println(Arrays.toString(nums));
        reverse(i+1,len-1,nums);
        return;
    }
    
    static void reverse(int i,int j,int[] nums)
    {
        while(i<j)
        {
            int n=nums[i];
            nums[i++]=nums[j];
            nums[j--]=n;
        }
    }
    }


//Example 1:

// Input: nums = [1,2,3]
// Output: [1,3,2]
// Example 2:

// Input: nums = [3,2,1]
// Output: [1,2,3]
// Example 3:

// Input: nums = [1,1,5]
// Output: [1,5,1]