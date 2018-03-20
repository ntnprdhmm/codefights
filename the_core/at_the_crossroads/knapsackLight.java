int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
    if (maxW >= (weight1 + weight2)) return value1 + value2;

    int val = 0;

    if (weight1 <= maxW) val = value1;
    if (weight2 <= maxW && value2 > value1) val = value2;

    return val;
}
