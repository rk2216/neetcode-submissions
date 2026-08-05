class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        // List<List<String>> ans = new ArrayList<>();
        for(String s : strs) {
            int[] cnt = new int[26];
            for(char ch : s.toCharArray()) {
                cnt[ch-'a']++;
            }
            String key = Arrays.toString(cnt);
            // System.out.println(key);
            map.putIfAbsent(key, new ArrayList<String>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
