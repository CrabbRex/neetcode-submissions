class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int max = 0;
        
        while (left < right) {
            int currLength = right - left;
            
            int lower = Math.min(heights[left], heights[right]);
            int currWater = currLength * (lower);
            if (max <= currWater) {
                System.out.println(currLength);
                System.out.println(lower);
                max = currWater;
            }

            
            if(heights[left] <= heights[right]) {
                lower = left;
                left++;
            }
            else {
                lower = right;
                right--;
            }
            
            
        }
        return max;
    }
}
