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
Tree<Integer> restoreBinaryTree(int[] inorder, int[] preorder) {
    return restoreBinaryTreeRec(inorder, preorder, 0, 0, inorder.length);
}

Tree<Integer> restoreBinaryTreeRec(int[] inorder, int[] preorder, int startPre, int startIn, int endIn) {
    if (startPre > preorder.length - 1 || startIn > endIn)
        return null;

    // create the node
    Tree<Integer> root = new Tree<Integer>(preorder[startPre]);

    // search in inorder array the current node
    int rootIdx = startIn;
    while (rootIdx <= endIn && inorder[rootIdx] != preorder[startPre])
        rootIdx++;

    root.left = restoreBinaryTreeRec(inorder, preorder, startPre+1, startIn, rootIdx - 1);
    root.right = restoreBinaryTreeRec(inorder, preorder, startPre + rootIdx - startIn + 1, rootIdx + 1, endIn);

    return root;
}
