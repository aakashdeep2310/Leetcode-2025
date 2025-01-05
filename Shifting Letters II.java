class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shiftArray = new int[n + 1];

        for (int[] shift : shifts) {
            int start = shift[0], end = shift[1], direction = shift[2];
            if (direction == 1) {
                shiftArray[start] += 1;
                shiftArray[end + 1] -= 1;
            } else {
                shiftArray[start] -= 1;
                shiftArray[end + 1] += 1;
            }
        }

        int netShift = 0;
        for (int i = 0; i < n; i++) {
            netShift += shiftArray[i];
            shiftArray[i] = netShift;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int shift = (shiftArray[i] % 26 + 26) % 26;
            result.append((char) ((c - 'a' + shift) % 26 + 'a'));
        }

        return result.toString();
    }
}
