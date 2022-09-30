

/**
 * duplicateArr
 * 2
    6 
    5 1 2 3 4 2  
    9
    8 7 2 5 4 7 1 3 6
 */
public class duplicateArr {
    public static void main(String[] args) {
        int a[]={  8 ,7 ,2, 5 ,4 ,7 ,1, 3, 6};
      
System.out.println(findDuplicate(a));
        
    }
    
        public static int findDuplicate(int [] arr) {
          int ans=0;
            for(int i=0;i<arr.length;i++){
                ans^=arr[i];
            }
            for(int i=1;i<arr.length;i++){
                ans^=i;
            }
            return ans;
            //    Write your code here.
        }
    }
    
