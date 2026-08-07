class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str.length() + ",");
        }
        sb.append('#');
        for(String str : strs) {
            sb.append(str);
        }
        // System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str == "") {
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>();
        int idx = 0;
        List<Integer> lengths = new ArrayList<Integer>();
        while(str.charAt(idx) != '#') {
            StringBuilder curr = new StringBuilder();
            while(str.charAt(idx) != ',') {
                curr.append(str.charAt(idx));
                idx++;
            }
            int len = Integer.parseInt(curr.toString());
            lengths.add(len);
            idx++;
        }
        idx++;
        int n = lengths.size();
        for(int i=0; i<n; i++) {
            ans.add(str.substring(idx, idx+lengths.get(i)));
            idx = idx+lengths.get(i);
        }

        return ans;
    }
}
