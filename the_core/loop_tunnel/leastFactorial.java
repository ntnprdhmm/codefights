int leastFactorial(int n) {
    int v = 1;
    int i = 2;
    while (v < n) {
        v *= i;
        i++;
    }
    return v;
}
