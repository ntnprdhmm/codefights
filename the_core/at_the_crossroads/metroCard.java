int[] metroCard(int lastNumberOfDays) {
    HashMap<Integer, int[]> m = new HashMap<Integer, int[]>();
    m.put(28, new int[]{31});
    m.put(30, new int[]{31});
    m.put(31, new int[]{28, 30, 31});
    return m.get(lastNumberOfDays);
}
