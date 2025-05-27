class Solution {
    public int differenceOfSums(int n, int m) {
        // int sum1 = 0;
        // int sum2 = 0;
        // for(int i = 1; i<=n; i++){
        //     if(i % m != 0){
        //         sum1 += i;
        //     }else{
        //         sum2 += i;
        //     }
        // }
        // return sum1 - sum2;

        // Optimal approach in O(1)
        int k = n/m;  // find floor value
        int totalSum = n*(n+1)/2; // find total sum
        int num2 = m*(k*(k+1)/2); // find sum of which are not divisible
        int num1 = totalSum - num2; // find sum of which are divisible
        return num1 - num2; 
    }
}
