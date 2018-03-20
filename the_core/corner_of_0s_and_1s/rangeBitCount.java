int rangeBitCount(int a, int b) {
    int count = 0;
    for (int c = a; c <= b; c++) {
        int v = c;
        while (v > 0) {
            if ((v&1) == 1) count++;
            v >>= 1;
        }
    }
    return count;
}
