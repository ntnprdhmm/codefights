String swapLexOrder(String str, int[][] pairs) {
    // CREATE GRAPHS FROM PAIRS
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
    for (int[] pair: pairs) {
        if (!map.containsKey(pair[0])) map.put(pair[0], new ArrayList<Integer>());
        if (!map.containsKey(pair[1])) map.put(pair[1], new ArrayList<Integer>());
        map.get(pair[0]).add(pair[1]);
        map.get(pair[1]).add(pair[0]);
    }

    // FIND CONNECTED COMPONENTS OF THE GRAPH
    ArrayList<ArrayList<Integer>> components = new ArrayList<ArrayList<Integer>>();
    HashSet<Integer> visited = new HashSet<Integer>();
    Queue<Integer> nodes = new PriorityQueue<Integer>();
    for (Integer key: map.keySet()) {
        nodes.add(key);
    }
    // continue while unvisited nodes
    if (nodes.peek() == null) return str;

    int root = nodes.poll();
    while (new Integer(root) != null && root != -1) {
        ArrayList<Integer> component = new ArrayList<Integer>();
        Queue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(root);
        visited.add(root);
        while (queue.peek() != null) {
            int current = queue.poll();
            component.add(current);
            for (int child: map.get(current)) {
                if (!visited.contains(child)) {
                    visited.add(child);
                    queue.add(child);
                }
            }
        }

        components.add(component);
        // find the next node
        while (visited.contains(root)) {
            if (nodes.peek() == null) {
                root = -1;
                break;
            }
            root = nodes.poll();
        }
    }

    StringBuilder sb = new StringBuilder(str);
    // SORT THE LETTERS OF EACH CONNECTED COMPONENT
    for (ArrayList<Integer> component: components) {
        Collections.sort(component);
        Character[] componentChars = new Character[component.size()];
        for (int i = 0; i < component.size(); i++) {
            componentChars[i] = str.charAt(component.get(i)-1);
        }
        Arrays.sort(componentChars, Collections.reverseOrder());

        for (int i = 0; i < component.size(); i++) {
            sb.setCharAt(component.get(i)-1, componentChars[i]);
        }
    }

    return sb.toString();
}
