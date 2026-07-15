class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> index = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(index.containsValue(nums[i])) {
                return true;
            }
            index.put(i, nums[i]);
        }
        return false;
    }
}