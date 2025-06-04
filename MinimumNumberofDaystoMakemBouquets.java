class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if((long)m*k > bloomDay.length) return -1;
        int maxi = 0;
        int mini = 0;
        for(int num : bloomDay){
            if(num > maxi){
                maxi = num;
            }
            if(num < mini){
                mini = num;
            }
        }

                // this brute will lead TLE
        // int ans = mini;
        // for(int i = mini; i <= maxi; i++){
        //     boolean gotIt = func(bloomDay, i, m, k);
        //     if(gotIt) {
        //         ans = i;
        //         break;
        //     }
        // }
        // return ans;

        // Optimal Approach using Binary Search
        int low = mini;
        int high = maxi;
        int ans = maxi;
        while(low <= high){
            int mid = (low+high)/2;

            boolean gotIt = func(bloomDay, mid, m, k);
            if(gotIt) {
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean func(int[] bloomDay, int day, int m, int k){
        int n = bloomDay.length;
        int count = 0;
        int noOfB = 0;
        for(int i = 0; i<n; i++){
            if(bloomDay[i] <= day){
                count++;
            }else{
                noOfB += (count/k);
                count = 0;
            }
        }
        noOfB += (count/k);

        if(noOfB >= m) return true;
        return false;
    }
}
