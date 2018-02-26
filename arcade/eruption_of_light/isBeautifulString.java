boolean isBeautifulString(String input) {
    int[] counter = new int[26];

    for (Character c: input.toCharArray()) counter[c - 'a']++;

    for (int i = 1; i < counter.length; i++) {
        if (counter[i-1] < counter[i]) {
            return false;
        }
    }

    return true;
}
