boolean containsDuplicates(int[] a) {
    Set<Integer> s = new HashSet<Integer>();
    for (Integer i: a) {
        if (s.contains(i)) {
            return true;
        }
        s.add(i);
    }
    return false;
}
