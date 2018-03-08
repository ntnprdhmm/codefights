int possibleSums(int[] coins, int[] quantity) {
    HashSet<Integer> set = new HashSet<Integer>();
    set.add(0);

    for (int i = 0; i < coins.length; i++) {
        ArrayList<Integer> currentSums = new ArrayList<Integer>(set);
        for (int q = 1; q <= quantity[i]; q++) {
            for (Integer sum: currentSums) {
                set.add(sum + (coins[i] * q));
            }
        }
    }

    return set.size() - 1;
}
