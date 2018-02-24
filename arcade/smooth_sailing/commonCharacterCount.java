int min(int a, int b) {
    return (a>b) ? b : a;
}

HashMap countStringCharacters(String s) {
    HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
    for (int i = 0; i < s.length(); i++) {
        Character c = s.charAt(i);
        int count = hashMap.get(c) != null ? hashMap.get(c)+1 : 1;
        hashMap.put(c, count);
    }
    return hashMap;
}

int commonCharacterCount(String s1, String s2) {
    HashMap<Character, Integer> map1 = countStringCharacters(s1);
    HashMap<Character, Integer> map2 = countStringCharacters(s2);

    int count = 0;
    for (Character c: map1.keySet()) {
        if (map2.get(c) != null) {
            count += min(map1.get(c), map2.get(c));
        }
    }
    return count;
}
