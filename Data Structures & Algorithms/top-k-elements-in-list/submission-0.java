class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        int[] toReturn = new int[k];
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        List<int[]> arr = new ArrayList<>();
        //Map.Entry gives something like:
        // (key, value)
        //count.entrySet() says 'give me a set of all key value pairs'
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        //Compare frequencies
        //Put bigger frequency first
        arr.sort((a, b) -> b[0] - a[0]);
        
        for(int i=0; i<k; i++) {
            System.out.println(arr.get(i)[0]);
            toReturn[i] = arr.get(i)[1];
        }

        return toReturn;
    }
}
