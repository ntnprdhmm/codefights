int digitsProduct(int n) {
    String result = "";

    if (n == 0) return 10;

    while (true) {
        if (n <= 9) {
            break;
        }

        int i = 9;
        while (i > 1) {
            if (n % i == 0) {
                result = Integer.toString(i) + result;
                n = (int)n/i;
                i = -10;
            }
            i--;
        }
        if (i == 1) return -1;
    }

    result = Integer.toString(n) + result;

    return Integer.parseInt(result);
}
