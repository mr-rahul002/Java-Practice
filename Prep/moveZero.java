class moveZeroes {
    public static void main(String[] args) {
        int a[]={0,1,0,3,12};
        mZeroes(a);
        printArr(a);

    }
    
    private static void printArr(int[] a) {
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]+" ");            
        }

    }

    public static void mZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
               int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
    }
}