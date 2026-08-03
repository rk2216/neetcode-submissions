class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        if(m != n) {
            return false;
        }
        char[] ch = new char[26];
        for(int i=0; i<n; i++) {
            ch[s.charAt(i)-'a']++;
        }
        for(int i=0; i<n; i++) {
            char ci = t.charAt(i);
            if(ch[ci-'a'] == 0) {
                return false;
            }
            ch[ci-'a']--;
        }

        return true;
    }
}
