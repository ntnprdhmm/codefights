char firstNotRepeatingCharacter(String s) {
    // value = [nbOccurences, firstIndex]
    HashMap<Character, Integer[]> counter = new HashMap<Character, Integer[]>();

    for (int i = 0; i < s.length(); i++) {
        if (counter.containsKey(s.charAt(i))) {
            Integer[] v = counter.get(s.charAt(i));
            v[0]++;
            counter.put(s.charAt(i), v);
        } else {
            counter.put(s.charAt(i), new Integer[]{1, i});
        }
    }

    int minIndex = (int)Math.pow(10, 9) + 7;
    char first = '_';

    for (char c: counter.keySet()) {
        Integer[] v = counter.get(c);
        if (v[0] == 1 && v[1] < minIndex) {
            minIndex = v[1];
            first = c;
        }
    }

    return first;
}
