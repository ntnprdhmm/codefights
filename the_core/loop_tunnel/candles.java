int candles(int candlesNumber, int makeNew) {
    int burned = 0;
    int candles = candlesNumber;
    int leftover = 0;
    while (candles > 0) {
        burned += candles;
        leftover += candles;
        int newCandles = (int)Math.floor(leftover / makeNew);
        leftover -= newCandles * makeNew;
        candles = newCandles;
    }
    return burned;
}
