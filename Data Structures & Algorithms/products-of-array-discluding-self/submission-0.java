class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int times = 1;
            for (int k = 0; k < nums.length; k++) {
                if (k != i) {
                    times *= nums[k];
                }
            }
            res[i] = times;
        }
        return res;
    }
}
