class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
            if (nums[i] < nums[i - 1]) {
                int t = nums[i];
                for (int j = i - 2; j >= 0; j--) {
                    if (t == nums[j]) {
                        return true;
                    }
                }
                nums[i] = nums[i - 1];
                nums[i - 1] = t;
            }
        }
        return false;
    }
}