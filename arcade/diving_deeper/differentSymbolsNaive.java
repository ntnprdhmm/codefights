int differentSymbolsNaive(String s) {
    HashSet<Character> set = new HashSet<Character>();
    for (Character c: s.toCharArray()) {
        set.add(c);
    }
    return set.size();
}
