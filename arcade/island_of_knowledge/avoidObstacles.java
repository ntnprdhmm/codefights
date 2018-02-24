boolean isDivider(int n, int[] arr) {
    for (Integer a: arr) {
        if (a % n == 0) {
            return true;
        }
    }
    return false;
}

int avoidObstacles(int[] arr) {
    // find lowest integer that divides none value of the array
    int minimalLength = 1;
    while (true) {
        if (!isDivider(minimalLength, arr)) {
            break;
        }
        minimalLength++;
    }
    return minimalLength;
}
