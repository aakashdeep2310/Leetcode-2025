class Solution {
    public int longestPalindrome(String[] words) {
        // int n = words.length;
        // int ans = 0;
        // boolean used = false;

        // HashMap<String, Integer> map = new HashMap<>();
       
        // for(int i = 0; i<n; i++){
        //     String s = words[i];
        //     String reversed = new StringBuilder(s).reverse().toString();

        //     if(map.containsKey(reversed) && map.get(reversed) > 0){
        //         ans += 4;
        //         map.put(reversed, map.get(reversed) - 1);
                
        //     }
        //     else{
        //         map.put(s, map.getOrDefault(s, 0) +1);
        //     }
        // }

        // for(String key : map.keySet()){
        //     if(key.charAt(0) == key.charAt(1)  && map.get(key) > 0){
        //         used = true;
        //         break;
        //     }
        // }

        // if(used) ans += 2;
        // return ans;

        // both are same approach

        Map<String, Integer> map = new HashMap<>();
        int result = 0;

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();

            if (map.getOrDefault(reversed, 0) > 0) {
                result += 4;
                map.put(reversed, map.get(reversed) - 1);
            } else {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        // Check for a word with both characters same to use in the center
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();

            if (word.charAt(0) == word.charAt(1) && count > 0) {
                result += 2;
                break;
            }
        }

        return result;
    }
}
