class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max = 0;
        while (l < r) {
            int dist = r - l;
            int volume = dist * (Math.min(heights[l], heights[r]));
            if(volume > max) {
                max = volume;
            }
            if(heights[r] > heights[l]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
