class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] toReturn = new int[2];
        for(int i=0; i<nums.length; i++) {
            for(int j=1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target && i != j) {
                    toReturn[0] = i;
                    toReturn[1] = j;
                    if(j < i) {
                        toReturn[0] = j;
                        toReturn[1] = i;
                    }
                }
            }
        }
        return toReturn;
    }
}
