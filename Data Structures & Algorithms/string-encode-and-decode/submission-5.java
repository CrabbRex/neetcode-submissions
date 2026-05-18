class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length()).append('#').append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int currString = 0;
        while (currString < str.length()) {
            int j = currString;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(currString, j));
            currString=j+1;
            j=currString+length;
            strs.add(str.substring(currString,j));
            currString=j;
        }
        return strs;
    }
}
