int[] concatenateArrays(int[] a, int[] b) {
    int[] r = new int[a.length + b.length];
    for (int i = 0; i < (a.length + b.length); i++) {
        r[i] = i < a.length ? a[i] : b[i-a.length];
    }
    return r;
}
