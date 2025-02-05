class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
       int i = 0;
       int j = 0;
       int n = s1.length();
       int count = 0;
       for(int t = 0; t < n; t++){
        if(s1.charAt(t) != s2.charAt(t)){
            count ++;
            if(count > 2) return false;
            else{
                if(count == 1) i = t;
                else j = t;
            }     
        }
       }
       return (s1.charAt(i) == s2.charAt(j)) && (s2.charAt(i) == s1.charAt(j));
    }
}
