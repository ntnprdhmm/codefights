int arrayMaximalAdjacentDifference(int[] arr) {
    int maxDiff = 0;
    for (int i = 1; i < arr.length; i++) {
        maxDiff = Math.max(maxDiff, Math.abs(arr[i] - arr[i-1]));
    }
    return maxDiff;
}
