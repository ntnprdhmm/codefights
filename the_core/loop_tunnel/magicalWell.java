int magicalWell(int a, int b, int n) {
    int win = 0;
    for (int i = 0; i < n; i++) win += a++*b++;
    return win;
}
