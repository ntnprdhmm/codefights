boolean areSimilar(int[] a, int[] b) {
    // 2 things to check: values are similar + we need at most 2 swaps
    // solution: count difference. Each time values are differents, save these values
    // and at the end, check if by making the swapps the arrays become similar

    int differences = 0;
    int[] a_diff = new int[2];
    int[] b_diff = new int[2];

    for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i]) {
            if (differences == 2) {
                return false;
            }
            else {
                a_diff[differences] = a[i];
                b_diff[differences] = b[i];
            }
            differences++;
        }
    }

    return (differences == 0) || (differences == 2 && a_diff[0] == b_diff[1] && a_diff[1] == b_diff[0]);
}
