int max(int[] arr) {
    int max = 0;
    for (int a: arr) max = Math.max(max, a);
    return max;
}

int electionsWinners(int[] votes, int k) {
    int maxVotes = max(votes);

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int v: votes) {
        map.put(v, map.get(v) != null ? map.get(v)+1 : 1);
    }

    if (k == 0) {
        return (map.get(maxVotes) == 1) ? 1 : 0;
    }

    int count = 0;
    for (int v: votes) {
        if (v+k > maxVotes && !map.containsKey(v+k)) {
            count++;
        }
    }
    return count;
}
