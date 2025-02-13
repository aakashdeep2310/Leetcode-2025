class Solution {
    public int minOperations(int[] nums, int k) {

        int n = nums.length;
        PriorityQueue<Long> p = new PriorityQueue<>();
        for(int i = 0; i<n; i++){
            p.add((long)nums[i]);
        }
        int count = 0;
        while(p.size() > 1 && p.peek() < k){
            long first = p.poll();
            long second = p.poll();
            long sum = (first * 2) + second;
            p.add(sum);
            count++;
        }
        return count;        
    }
}
