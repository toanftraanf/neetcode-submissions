class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        if(n <= 0) {
            return false;
        } else {
            for(int i = 0; i < n; i++) {
                for (int k = i + 1; k < n; k++) {
                    if (nums[i] == nums[k]) return true;
                }
            }
            return false;
        }
    }
}