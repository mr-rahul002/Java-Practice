class rotateArr {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int k=3;
        rotate(a,k);
    printArr(a);
    }
    private static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void rotate(int[] nums, int k) {
     k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    private static void reverse(int []nums,int s,int e){
        while(s<e){
            int temp=nums[s];
            nums[s++]=nums[e];
            nums[e--]=temp;
        }
    }
}