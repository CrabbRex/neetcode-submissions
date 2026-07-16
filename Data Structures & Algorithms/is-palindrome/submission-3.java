class Solution {
    public boolean isPalindrome(String s) {
        String palindrome = "";
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)) {
                palindrome = palindrome + Character.toLowerCase(c);
            }
        }
        System.out.println(palindrome);
        
        int l = 0;
        int r = palindrome.length()-1;
        while(l < r) {
            if(palindrome.charAt(l) != palindrome.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
