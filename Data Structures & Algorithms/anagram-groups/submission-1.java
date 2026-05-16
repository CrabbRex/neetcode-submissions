class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> strings = new HashMap<>();
        for (int i=0; i<strs.length; i++) {
            char[] characterArray = strs[i].toCharArray();
            Arrays.sort(characterArray);
            String currStrsSorted = new String(characterArray);
            strings.putIfAbsent(currStrsSorted, new ArrayList<>());
            strings.get(currStrsSorted).add(strs[i]);
        }
        return new ArrayList<>(strings.values());
    }
}
