public class Sort01 {
    public static void main(String[] args) {
        int a[]={0,0,1,0,1,1,0,0,1,1};
        int n=a.length;
        sortOne(a,n);
        printArr(a,n);
    }
    private static void printArr(int[] a, int n) {
        for (int i = 0; i <n; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void sortOne(int []a,int n){
        int left=0,right=n-1;
        while(left<right){
            while(a[left]==0){
                left++;
            }
            while(a[right]==1){
                right--;
            }
            if(a[left]==1 &&a[right]==0&left<right){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
        }

    }
}
