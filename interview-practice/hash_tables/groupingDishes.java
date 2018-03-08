String[][] groupingDishes(String[][] dishes) {

    // find dishes associated to each ingredient
    HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
    for (int row = 0; row < dishes.length; row++) {
        for (int col = 1; col < dishes[row].length; col++) {
            if (!map.containsKey(dishes[row][col])) {
                map.put(dishes[row][col], new ArrayList<String>());
            }
            map.get(dishes[row][col]).add(dishes[row][0]);
        }
    }

    // count how many ingredients are in many dishes
    int resLength = 0;
    for (String key: map.keySet()) {
        if (map.get(key).size() > 1) {
            resLength++;
        }
    }

    // transform HashMap to Array
    String[][] res = new String[resLength][];
    int i = 0;
    for (String key: map.keySet()) {
        if (map.get(key).size() > 1) {
            res[i] = new String[1 + map.get(key).size()];
            res[i][0] = key;
            Collections.sort(map.get(key));
            int j = 1;
            for (String dish: map.get(key)) {
                res[i][j] = dish;
                j++;
            }
            i++;
        }
    }

    Arrays.sort(res, new Comparator<String[]>() {
        @Override
        public int compare(String[] a, String[] b) {
            return a[0].compareTo(b[0]);
        }
    });

    return res;

}
