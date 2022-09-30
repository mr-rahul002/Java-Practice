public class ArrSortN {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
    boolean b=check(a);
    System.out.println(b);
    
    }
   
    public static boolean check(int[] nums) {
        int count =0;
            for(int i=1;i<nums.length;i++){
                 if(nums[i-1]>nums[i]){
                count++;
            }
            }
           if(nums[nums.length-1]>nums[0])
               count++;
           return  count<=1;
        }
    }
