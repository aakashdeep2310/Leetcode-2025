class Solution {
    public int longestPalindrome(String s) {
        // int ans = 0;
        // boolean odd = false;
        // HashMap<Character, Integer> freq = new HashMap<>();

        // for(char ch : s.toCharArray()){
        //     freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        // }

        // for(char ch : freq.keySet()){
        //     int f = freq.get(ch);
        //     if(f % 2 == 0){
        //         ans += freq.get(ch);
        //     }else{
        //         ans += f - 1;
        //         odd = true;
        //     }
        // }
        // if(odd) ans+=1;
        // return ans;


        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                set.remove(ch);
                ans += 2; 
            }else{
                set.add(ch);
            }
        }

        if(!set.isEmpty()) return ans+1;
        return ans;
    }
}
