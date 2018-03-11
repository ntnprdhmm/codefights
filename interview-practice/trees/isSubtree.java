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

boolean isSubtree(Tree<Integer> t1, Tree<Integer> t2) {
    if (t2 == null) return true;
    if (t1 == null) return t1 == t2;

    // if same value as t2's root => check substree
    if (t1.value.equals(t2.value) && equals(t1, t2)) return true;

    return isSubtree(t1.left, t2) || isSubtree(t1.right, t2);
}

boolean equals(Tree<Integer> a, Tree<Integer> b) {
    if (a==null && b==null) return true;
    if (a==null || b==null) return false;
    if (!a.value.equals(b.value)) return false;
    return equals(a.left, b.left) && equals(a.right, b.right);
}

/*
boolean isSubtree(Tree<Integer> t1, Tree<Integer> t2) {
    if (t2 == null) return true;
    if (t1 == null) return t1 == t2;

    // go throught t1 using BFS
    LinkedList<Tree<Integer>> queue = new LinkedList<Tree<Integer>>();
    queue.add(t1);

    while (queue.size() > 0) {
        Tree<Integer> current = queue.poll();

        // if same value as t2's root => check substree
        if (current.value.equals(t2.value) && equals(current, t2)) {
            return true;
        }

        // add children of current in the queue
        if (current.left != null) queue.add(current.left);
        if (current.right != null) queue.add(current.right);
    }

    return false;
}

boolean equals(Tree<Integer> a, Tree<Integer> b) {
    if (a==null && b==null) return true;
    if (a==null || b==null) return false;
    if (!a.value.equals(b.value)) return false;
    return equals(a.left, b.left) && equals(a.right, b.right);
}*/
