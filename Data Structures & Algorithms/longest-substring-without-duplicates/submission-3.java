class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 1;
        int count = 1;
        if(s.length() <= 0) {
            return 0;
        }
        for(int i=0; i<s.length(); i++) {
            HashSet<Character> sequence = new HashSet<>();
            char c = s.charAt(i);
            sequence.add(c);
            int length = 1;
            for(int j=i+1; j<s.length(); j++) {
                if(!sequence.contains(s.charAt(j))) {
                    sequence.add(s.charAt(j));
                    length++;
                    if (length > max) {
                        max = length;
                    }
                }
                else {
                    break;
                }
            }
        }
        return max;
    }
}
