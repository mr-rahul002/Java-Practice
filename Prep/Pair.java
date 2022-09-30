// import java.util.* ;

// public class Pair{
   
//     // }
//     public static int[][] pairSum(int[] arr, int s) {
//         // Write your code here.
//         Arrays.sort(arr);
//         List<Integer> a=new ArrayList<>();
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]+arr[j]==s){
//                     a.add(arr[i]);
//                     a.add(arr[j]);
                        
//                 }
//             }
//         }
//         int l=a.size();
//         int[][]  ar=new int[l/2][2];
//         int k=0;
//         for(int i=0;i<l/2;i++){
//             for(int j=0;j<2;j++){
//                 ar[i][j]=(int)a.get(k++);
//             }
//         }return ar;
//     }
// }