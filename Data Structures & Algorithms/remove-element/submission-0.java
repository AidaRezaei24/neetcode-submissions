class Solution {
    public int removeElement(int[] nums, int val) {
        int cut=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[cut] = nums[i];
                cut++;
            }

        }
        return cut;
    }
}