class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        //store prefix produce except current element
        ans[0] = 1;
        for(int i=1; i<n; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }
        int postProd = 1;
        for(int i=n-1; i>=0; i--) {
            ans[i] = ans[i] * postProd;
            postProd *= nums[i];
        }

        return ans;
    }
}  
