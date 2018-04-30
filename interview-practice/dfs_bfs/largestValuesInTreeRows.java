//
// Definition for binary tree:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }
int[] largestValuesInTreeRows(Tree<Integer> t) {
    LinkedList<Integer> maxValues = new LinkedList<Integer>();
    Queue<Tree<Integer>> current = new LinkedList<Tree<Integer>>();
    if (t != null) current.add(t);
    while (!current.isEmpty()) {
        Queue<Tree<Integer>> next = new LinkedList<Tree<Integer>>();
        Integer m = -10000;
        while (!current.isEmpty()) {
            Tree<Integer> c = current.poll();
            m = Math.max(c.value, m);
            if (c.left != null) next.add(c.left);
            if (c.right != null) next.add(c.right);
        }
        maxValues.add(m);
        current = next;
    }
    int[] res = new int[maxValues.size()];
    for (int i = 0; i < res.length; i++) {
        res[i] = maxValues.get(i);
    }
    return res;
}
