class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] toReturn = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int p1 = numbers[left];
            int p2 = numbers[right];
            if (p1 + p2 > target) {
                right--;
            }
            else if(p1 + p2 < target) {
                left++;
            }
            else if (p1 + p2 == target){
                toReturn[0] = left+1;
                toReturn[1] = right+1;
                break;
            }
        }
        return toReturn;
    }
}
