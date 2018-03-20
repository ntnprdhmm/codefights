int arrayPacking(int[] a) {
    int m = 0;
    for (int i = 0; i < a.length; i++) {
        m |= a[i] << 8*i;
    }
    return m;
}
