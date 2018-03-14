int houseRobber(int[] nums) {
    if (nums.length == 0) return 0;

    for (int i = 1; i < nums.length; i++) {
        if (i > 1) {
            nums[i] += nums[i-2];
        }
        nums[i] = Math.max(nums[i], nums[i-1]);
    }
    return nums[nums.length - 1];
}

/*HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

int houseRobber(int[] nums) {
    return this.houseRobber(nums, 0);
}

int houseRobber(int[] nums, int i) {
    if (i >= nums.length) return 0;

    if (!memo.containsKey(i)) {
        memo.put(i, Math.max(nums[i] + houseRobber(nums, i+2), houseRobber(nums, i+1)));
    }

    return memo.get(i);
}*/
