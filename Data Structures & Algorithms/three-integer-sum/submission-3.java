class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> toReturn = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(nums[i] >= 1) {
                return toReturn;
            }
            int l=i+1;
            int r = nums.length-1;
            while(l<r) {
                if(nums[i] + nums[l] + nums[r] > 0) {
                    r--;
                }
                else if(nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                }
                else {
                    List<Integer> numbers = new ArrayList<>(List.of(nums[i], nums[l], nums[r]));
                    if(!toReturn.contains(numbers)) {
                        toReturn.add(numbers);
                    }
                    l++;
                }
            }
        }
        return toReturn;
    }
}
