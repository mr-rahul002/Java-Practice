public class SwapAlt {
    static void printArr(int a[],int n){
        for (int i = 0; i <n; i++) {
            System.out.print(a[i]+" ");
        }
    }

    static void swapAlt(int a[],int size){
        for (int i = 0; i <size; i+=2) {
            if((i+1)<size){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int eve[]={5,2,9,4,7,6,1,0};
        int s=eve.length;
        int od[]={11,33,9,76,43};
        int siz=od.length;
        
        swapAlt(eve,s);
        printArr(eve,s);
        System.out.println("\n");
        swapAlt(od, siz);
        printArr(od, siz);
    }
}
