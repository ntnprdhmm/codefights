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
int[] traverseTree(Tree<Integer> t) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    LinkedList<Tree> q = new LinkedList<Tree>();
    q.add(t);
    while (q.peek() != null) {
        Tree curr = q.poll();
        if (curr.left != null) q.add(curr.left);
        if (curr.right != null) q.add(curr.right);
        arr.add((int)curr.value);
    }

    int[] res = new int[arr.size()];
    for (int i = 0; i < arr.size(); i++) res[i] = arr.get(i);
    return res;
}
