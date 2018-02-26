String[] fileNaming(String[] names) {
    
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    HashSet<String> set = new HashSet<String>();

    for (int i = 0; i < names.length; i++) {
        if (map.containsKey(names[i])) {
            int k = 1;
            while (map.containsKey(names[i] + "(" + k + ")")) {
                k++;
            }
            names[i] = names[i] + "(" + k + ")";
        }
        map.put(names[i], 1);
        set.add(names[i]);
    }
    return names;
}
