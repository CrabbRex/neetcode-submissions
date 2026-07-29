class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> toReturn = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.sort(null);
                        if(!toReturn.contains(temp)) {
                            toReturn.add(temp);

                        }

                    }
                }
            }
        }
        
        return toReturn;
    }
}
