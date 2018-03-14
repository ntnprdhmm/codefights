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
Tree<Integer> deleteFromBST(Tree<Integer> t, int[] queries) {
    for (int query: queries) {
        Integer value = new Integer(query);
        t = deleteFromBSTRec(t, value);
    }
    return t;
}

Tree<Integer> deleteFromBSTRec(Tree<Integer> t, Integer value) {
    if (t == null) return t;
    if (t.value.equals(value)) {
        if (t.left != null) {
            // replace current value by max value of left substree
            Tree<Integer> rightmost = findRightmost(t.left);
            t.value = rightmost.value;
            // remove this value from left subtree
            t.left = removeRightmost(t.left);
        } else {
            return t.right;
        }
    }
    if (value > t.value) {
        t.right = deleteFromBSTRec(t.right, value);
    } else {
        t.left = deleteFromBSTRec(t.left, value);
    }
    return t;
}

Tree<Integer> findRightmost(Tree<Integer> t) {
    if (t == null || t.right == null) return t;
    return findRightmost(t.right);
}

Tree<Integer> removeRightmost(Tree<Integer> t) {
    if (t.right == null) {
        // found the rightmost => return the left subtree
        return t.left;
    }
    t.right = removeRightmost(t.right);
    return t;
}
