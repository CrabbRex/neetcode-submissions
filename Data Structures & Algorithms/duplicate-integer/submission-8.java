class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> index = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(index.containsKey(nums[i])) {
                return true;
            }
            index.put(nums[i], i);
        }
        return false;
    }
}