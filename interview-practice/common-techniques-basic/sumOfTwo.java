boolean sumOfTwo(int[] a, int[] b, int v) {
    Set<Integer> c = new HashSet<Integer>();
    for (Integer i : a) {
        c.add(v-i);
    }
    for (Integer i : b) {
        if (c.contains(i)) {
            return true;
        }
    }
    return false;
}
