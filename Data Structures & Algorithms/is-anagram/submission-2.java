class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sSorted = s.toCharArray();
        char[] tSorted = t.toCharArray();
        if(s.length() != t.length()) {
            return false;
        }
        Arrays.sort(sSorted);
        Arrays.sort(tSorted);
        for(int i=0; i<s.length(); i++) {
            if(sSorted[i] != tSorted[i]) {
                return false;
            }
        }
        return true;
    }
}
