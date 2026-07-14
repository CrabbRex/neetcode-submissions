class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        int[] toReturn = new int[2];
        for(int i=0; i<nums.length; i++) {
            if(indices.containsKey(target - nums[i])) {
                Integer idx1 = indices.get(target-nums[i]);
                toReturn[0] = idx1;
                toReturn[1] = i;
                break;
            }
            indices.put(nums[i], i);
        }
        return toReturn;
    }
}
