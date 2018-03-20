boolean isInfiniteProcess(int a, int b) {
    return (b < a) || ((b-a) % 2 == 1);
}
