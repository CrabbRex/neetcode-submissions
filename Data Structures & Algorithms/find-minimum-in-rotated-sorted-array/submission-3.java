class Solution {
    public int findMin(int[] nums) {
        //Binary search untill you find where middle + 1 is less than middle.
        //return middle + 1
        int l = 0;
        int r = nums.length - 1;
        int res = -1;
        if(nums[l] < nums[r] || nums.length == 1) {
            return nums[l];
        }

        while(l < r) {
            int mid = (l + r)/2;
            if(nums[l] < nums[mid]) {
                l = mid;
            }
            else {
                r = mid;
            }
        }
        return nums[l+1];
    }
}
