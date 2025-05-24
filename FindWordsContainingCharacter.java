class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> list = new ArrayList<>();
        int n = words.length;
        for(int i = 0; i<n; i++){
            String st = words[i];
            if(st.contains(String.valueOf(x))){
                list.add(i);
            }
        }
        return list;
    }
}
