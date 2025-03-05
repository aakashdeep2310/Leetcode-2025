class Solution {
    public long coloredCells(int n) {
        long ans = n;
        return (1+(2*(ans-1))*ans);
    }
}
