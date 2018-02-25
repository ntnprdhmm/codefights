int arrayMaxConsecutiveSum(int[] arr, int k) {
    int maxSum = 0;
    // calculate the sum of the first k elements
    for (int i = 0; i < k; i++) {
        maxSum += arr[i];
    }
    int sum = maxSum;
    // slide the window and check if the sum is bigger
    for (int i = k; i < arr.length; i++) {
        // update sum
        sum = sum - arr[i-k] + arr[i];
        maxSum = Math.max(sum, maxSum);
    }
    return maxSum;
}
