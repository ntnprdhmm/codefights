boolean isPower(int n) {
    int sRoot = (int)Math.floor(Math.sqrt(n));
    for (int i = 0; i <= sRoot; i++) {
        for (int j = 0; j <= sRoot; j++) {
            if (Math.pow(i, j) == n) return true;
        }
    }
    return false;
}
