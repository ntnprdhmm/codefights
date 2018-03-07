int firstDuplicate(int[] a) {
    HashSet<Integer> alreadyFound = new HashSet<Integer>();
    for (int v: a) {
        if (alreadyFound.contains(v)) return v;
        alreadyFound.add(v);
    }
    return -1;
}
