int additionWithoutCarrying(int a, int b) {
    int res = 0;
    int i = 0;

    while (a > 0 && b > 0) {
        res += (((a % 10) + (b % 10)) % 10) * Math.pow(10, i);
        i++;
        a = (int)Math.floor(a / 10);
        b = (int)Math.floor(b / 10);
    }

    if (a > 0) {
        res += a * (int)Math.pow(10, i);
    } else if (b > 0) {
        res += b * (int)Math.pow(10, i);
    }

    return res;
}
