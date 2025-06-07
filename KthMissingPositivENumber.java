class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int missing = 0;
        while(low<=high){
            int mid = (low+high)/2;
            missing = arr[mid] - (mid+1);

            if(missing < k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high + 1 + k; // low + k
        
    }
}
