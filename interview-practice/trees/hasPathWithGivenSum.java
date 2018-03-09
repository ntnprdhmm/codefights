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
boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
    if (t == null && s == 0) return true;

    // using BFS
    LinkedList<Tree<Integer>> q = new LinkedList<Tree<Integer>>();
    q.add(t);

    // while there are still nodes to visit
    while (q.peek() != null) {
        Tree<Integer> current = q.poll();

        if (isLeaf(current) && current.value == s) {
            return true;
        }

        if (current.left != null) {
            current.left.value += current.value;
            q.add(current.left);
        }
        if (current.right != null) {
            current.right.value += current.value;
            q.add(current.right);
        }
    }

    return false;
}

boolean isLeaf(Tree<Integer> t) {
    return t.left == null && t.right == null;
}
