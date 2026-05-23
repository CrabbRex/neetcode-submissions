class Solution {
    public int longestConsecutive(int[] nums) {
        int[] toReturn = new int[nums.length];
        int counter = 1;
        int maxCounter = 1;
        for (int i=0; i<nums.length; i++) {
            toReturn[i] = nums[i];
        }
        Arrays.sort(toReturn);
        if(nums.length == 0) {
            return 0;
        }
        for (int i=0; i<nums.length-1; i++) {
            if (toReturn[i] == toReturn[i + 1]) {
                continue;
            }
            if (toReturn[i+1] == toReturn[i] + 1) {
                counter++;
            } else {
                counter = 1;
            }
            if(counter > maxCounter) {
                maxCounter = counter;
            }

            if (toReturn[i+1] < toReturn[i]) {
                counter = 0;
            }
        }
        return maxCounter;
    }
}
