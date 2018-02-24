HashMap countStringCharacters(String s) {
    HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
    for (int i = 0; i < s.length(); i++) {
        Character c = s.charAt(i);
        int count = hashMap.get(c) != null ? hashMap.get(c)+1 : 1;
        hashMap.put(c, count);
    }
    return hashMap;
}

boolean palindromeRearranging(String inputString) {
    HashMap<Character, Integer> map = countStringCharacters(inputString);

    Boolean foundOdd = false;
    for (Character c: map.keySet()) {
        if (map.get(c) % 2 == 1) {
            if (foundOdd) {
                return false;
            }
            foundOdd = true;
        }
    }
    return true;
}
