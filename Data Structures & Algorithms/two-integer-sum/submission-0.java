class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            int num = nums[i];
            int find = target - num;
            if(map.containsKey(find)) {
                return new int[]{map.get(find), i};
            }
            if(!map.containsKey(num)) {
                map.put(num, i);
            }
        }
        return new int[0];
    }
}
