class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int low = 1;
        int high = 0;
        for(int num : weights){
            high += num;
        }

        int ans = high;

        while(low <= high){
            int mid = (low+high)/2;
            boolean valid = func(weights, mid, days);
            if(valid){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean func(int[] weights, int cap, int days){
       int dayCount = 1;
        int currentLoad = 0;

        for(int weight : weights){
            if(weight > cap) return false;

            if(currentLoad + weight > cap){
                dayCount++;
                currentLoad = 0;
            }

            currentLoad += weight;
        }

        return dayCount <= days;
    }
}
