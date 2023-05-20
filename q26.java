class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int i = 0;
        for (int j = 1; j <= nums.length - 1; j++) {
            if (nums[i] == nums[j]) {
                continue;
            } else if (nums[i] != nums[j]) {
                int tmp = nums[i + 1];
                nums[i + 1] = nums[j];
                nums[j] = tmp;
                i++;
            }
        }

        return i + 1;
    }
}
