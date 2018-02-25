int knapsackLight(int v1, int w1, int v2, int w2, int maxW) {
    // if I can carry both, return both
    if (w1+w2 <= maxW) return v1+v2;
    // return the max I can carry
    if (v1 > v2) {
        if (w1 <= maxW) return v1;
        if (w2 <= maxW) return v2;
    } else {
        if (w2 <= maxW) return v2;
        if (w1 <= maxW) return v1;
    }
    // by default, take nothing
    return 0;
}
