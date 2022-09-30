
public class peakElemMo {
    public static void main(String[] args) {
        
    }
        public int peakIndexInMountainArray(int[] arr) {
            int s = 0, e = arr.length - 1;
            int mid = s + (e - s) / 2;
            while (s < e) {
                if (arr[mid] < arr[mid + 1]) {
                    s = mid + 1;
                } else {
                    e = mid;
                }
                mid = s + (e - s) / 2;
            }
            return s;
        }
    
}
// [0,2,1,0]