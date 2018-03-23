int isSumOfConsecutive2(int n) {
    int count = 0;

    for (int i = 1; i < n-2; i++) {
        int sum = i;
        int j = i+1;
        while (sum < n) {
            sum += j;
            j++;
        }
        if (sum == n) count++;
    }

    return count;
}
