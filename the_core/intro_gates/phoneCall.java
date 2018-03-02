int phoneCall(int min1, int min2_10, int min11, int s) {
    if (s < min1) return 0;
    if (s == min1) return 1;
    if (s-min1 <= (min2_10 * 9)) {
        return 1 + (s-min1)/min2_10;
    }
    return 10 + (s-min1-(9*min2_10))/min11;
}
