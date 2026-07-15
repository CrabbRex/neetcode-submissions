class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> index = new HashMap<>();
        int[] toReturn = new int[k];
        for(int i=0; i<nums.length; i++) {
            if(index.containsKey(nums[i])) {
                int toPut = index.get(nums[i]) + 1;
                index.put(nums[i], toPut);
            } else {
                index.put(nums[i], 1);
            }
        }

        List<int[]> frequencies = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : index.entrySet()) {
            frequencies.add(new int[] {entry.getValue(), entry.getKey()});
        }
        frequencies.sort((a, b) -> b[0] - a[0]);
        for(int i=0; i<k; i++) {
            toReturn[i] = frequencies.get(i)[1];
        }
        return toReturn;
    }
}
