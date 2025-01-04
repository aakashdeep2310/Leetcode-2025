class Solution {
    public int countPalindromicSubsequence(String s) {
          HashSet<String> uniquePalindromes = new HashSet<>();
        
         for (char c = 'a'; c <= 'z'; c++) {
            int first = s.indexOf(c);   
            int last = s.lastIndexOf(c); 
 
            if (first != -1 && last > first + 1) {
             
                HashSet<Character> middleCharacters = new HashSet<>();
                for (int i = first + 1; i < last; i++) {
                    middleCharacters.add(s.charAt(i));
                }
                for (char middle : middleCharacters) {
                    uniquePalindromes.add("" + c + middle + c);
                }
            }
        }
        return uniquePalindromes.size();
    }
}
