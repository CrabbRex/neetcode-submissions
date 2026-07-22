class Solution {
    public int characterReplacement(String s, int k) {
        //Move right
        //while(window is invalid) <-- What makes the window invalid??
        //  shrink left
        //update answer
        Map<Character, Integer> count = new HashMap<>();
        int l = 0;
        int res = 0;
        int max = 0;

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
            max = Math.max(max, count.get(c));

            while((i - l + 1) - max > k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, i-l+1);
        }
        System.out.println(count);
        return res;
    }
}
