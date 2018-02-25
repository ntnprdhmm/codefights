int depositProfit(int deposit, int rate, int threshold) {
    double amount = deposit;
    int count = 0;
    while (amount < threshold) {
        count ++;
        amount += amount * ((double)rate/100);
    }
    return count;
}
