boolean areFollowingPatterns(String[] strings, String[] patterns) {
    HashMap<String, String> map = new HashMap<String, String>();
    HashSet<String> set = new HashSet<String>();

    for (int i = 0; i < patterns.length; i++) {
        if (map.containsKey(patterns[i])) {
            if (!map.get(patterns[i]).equals(strings[i])) {
                return false;
            }
        } else {
            if (set.contains(strings[i])) {
                return false;
            }
            map.put(patterns[i], strings[i]);
            set.add(strings[i]);
        }
    }

    return true;
}
