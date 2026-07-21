class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int l = 0;
        HashSet<Character> seq = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            while(seq.contains(c)) {
                seq.remove(s.charAt(l));
                l++;
            }
            seq.add(c);
            if(seq.size() > max) {
                max = seq.size();
            }
        }
        return max;
    }
}
