boolean areEquallyStrong(int aL, int aR, int bL, int bR) {
    return (aL == bL && aR == bR) || (aL == bR && aR == bL);
}
