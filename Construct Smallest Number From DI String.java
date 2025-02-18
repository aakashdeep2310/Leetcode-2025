class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        boolean[] used = new boolean[10];
        StringBuilder result = new StringBuilder();
        backtrack(pattern, 0, new int[n+1], used, result);
        return result.toString();
    }

    private boolean backtrack(String pattern, int index, int[] num, boolean[] used, StringBuilder result){
        if(index > pattern.length()){
            for(int i = 0; i<num.length; i++){
                result.append(num[i]);
            }
            return true;
        }
        for(int digit = 1; digit <= 9; digit++){
            if(!used[digit] && (index == 0 || isValid(num[index -1], digit, pattern.charAt(index - 1)))){
                used[digit] = true;
                num[index] = digit;
                if(backtrack(pattern, index + 1, num, used, result)){
                    return true;
                }
                num[index] = 0;
                used[digit] = false;
            }
        }
        return false;
    }

    private boolean isValid(int lastDigit, int currentDigit, char condition){
        return (condition == 'I' && lastDigit < currentDigit) || (condition == 'D' && lastDigit > currentDigit);
    }
}
