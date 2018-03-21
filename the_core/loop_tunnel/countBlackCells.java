int countBlackCells(int n, int m) {
    if (n == m) return (n + 2*(n-1));
    if (n == 1 || m == 1) return n*m;
    return n + m - gcd(n, m) + (gcd(n, m)-1)*2;
}

int gcd(int n, int m) {
    if (n == 0) return m;
    if (m == 0) return n;

    int r = Math.max(n, m) % Math.min(n, m);
    return gcd(Math.min(n, m), r);
}
