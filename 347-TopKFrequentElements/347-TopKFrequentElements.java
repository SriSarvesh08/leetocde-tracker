// Last updated: 7/8/2026, 3:35:25 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        List<int[]> pairs = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : freq.entrySet())
            pairs.add(new int[] { entry.getValue(), entry.getKey() });

        pairs.sort((a, b) -> Integer.compare(b[0], a[0]));

        int[] result = new int[k];

        for (int i = 0; i < k; i++)
            result[i] = pairs.get(i)[1];

        return result;
    }
}