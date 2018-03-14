int climbingStairs(int n) {
    if (n == 0) return 1;

    int[] memo = new int[n+1];
    memo[0] = 1;
    memo[1] = 1;

    for (int i = 2; i <= n; i++) {
        memo[i] = memo[i-1] + memo[i-2];
    }

    return memo[n];
}

/*HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

int climbingStairs(int n) {
    if (n == 0) return 1;
    if (n < 0) return 0;
    if (!memo.containsKey(n)) {
        memo.put(n, climbingStairs(n-1) + climbingStairs(n-2));
    }
    return memo.get(n);
}*/
