//Brute-Force
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] toReturn = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            int counter = 1;
            for (int j=0; j<nums.length; j++) {
                //make counter, set to index after calucaltions
                if(i != j) {
                    counter = nums[j] * counter;
                }
            }
            toReturn[i] = counter;
        }
        return toReturn;
    }
}  
