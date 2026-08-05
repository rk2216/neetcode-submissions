class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[n+1];
        for(int i=1; i<=n; i++) {
            buckets[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int freq = entry.getValue();
            int num = entry.getKey();
            buckets[freq].add(num);
        }

        int[] ans = new int[k];
        int idx = 0;
        for(int i=n; i>0; i--) {
            List<Integer> list = buckets[i];
            int lN = list.size();
            for(int j=0; j<lN; j++) {
                ans[idx++] = list.get(j);
                if(idx == k){
                    break;
                }
            }
            if(idx == k) {
                break;
            }
        }

        return ans;
    }
}
