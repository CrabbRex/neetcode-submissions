class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> dup = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(dup.contains(nums[i])) {
                return nums[i];
            }
            dup.add(nums[i]);
        }
        return -1;
    }
}
