int arrayChange(int[] arr) {
    int moves = 0;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] <= arr[i-1]) {
            moves += arr[i-1] - arr[i] + 1;
            arr[i] = arr[i-1] + 1;
        }
    }
    return moves;
}
