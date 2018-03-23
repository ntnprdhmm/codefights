int squareDigitsSequence(int a) {
    HashSet<Integer> set = new HashSet<Integer>();

    while (!set.contains(a)) {
        set.add(a);
        String s = Integer.toString(a);
        int sum = 0;
        for (char c: s.toCharArray()) {
            sum += Math.pow(Character.getNumericValue(c), 2);
        }
        a = sum;
    }

    return set.size() + 1;
}
