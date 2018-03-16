String[] composeRanges(int[] nums) {
    ArrayList<String> ranges = new ArrayList<String>();
    int start = 0;
    int i = 1;
    for (i = 1; i < nums.length; i++) {
        if (nums[i] - nums[start] != i - start) {
            if (i-1 == start) {
                ranges.add(Integer.toString(nums[start]));
            } else {
                ranges.add(nums[start] + "->" + nums[i-1]);
            }
            start = i;
        }
    }

    if (start == nums.length - 1) {
        ranges.add(Integer.toString(nums[start]));
    } else if (nums.length > 0) {
        ranges.add(nums[start] + "->" + nums[i-1]);
    }

    return ranges.toArray(new String[ranges.size()]);
}
