int pagesNumberingWithInk(int current, int numberOfDigits) {
    while (numberOfDigits > 0) {
        numberOfDigits -= countDigits(current);
        if (numberOfDigits > 0) {
            current++;
        }
    }
    if (numberOfDigits < 0) current--;
    return current;
}

int countDigits(int n) {
    int count = 0;
    while (n != 0) {
        count++;
        n = (int)n/10;
    }
    return count;
}
