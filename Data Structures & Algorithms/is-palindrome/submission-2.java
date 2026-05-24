class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(!Character.isLetterOrDigit(s.charAt(left))) {
                while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                    left++;
                }
            }
            if(!Character.isLetterOrDigit(s.charAt(right))) {
                while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                    right--;
                }
            }
            Character curLeft = s.charAt(left);
            Character curRight = s.charAt(right);
            if(Character.toLowerCase(curLeft) != Character.toLowerCase(curRight)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
