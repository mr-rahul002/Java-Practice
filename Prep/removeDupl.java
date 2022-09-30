public class removeDupl {
  public static void main(String[] args) {
    int []nums = {0,0,1,1,1,2,2,3,3,4};
   removeDuplicates(nums);
   printArr(nums);
  }
  static void printArr(int [] nums){
    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i]+" ");
        
    }
  }
    public static int removeDuplicates(int[] nums) {
            int n=nums.length;
            if(n<2) return n;
            int id=1;
            for(int i=1;i<n;i++){
                    if(nums[i]!=nums[i-1]) 
                            nums[id++]=nums[i];
            }
        return id;
    }
}