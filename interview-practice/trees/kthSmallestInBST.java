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

int k, r;

int kthSmallestInBST(Tree<Integer> t, int k) {
    this.k = k;
    kthSmallestInBSTHelper(t);
    return this.r;
}

void kthSmallestInBSTHelper(Tree<Integer> t) {
    if (t != null) {
        kthSmallestInBSTHelper(t.left);

        this.k--;
        if (this.k == 0) {
            this.r = t.value;
        } else {
            kthSmallestInBSTHelper(t.right);
        }

    }
}

/*
int kthSmallestInBST(Tree<Integer> t, int k) {
    LinkedList<Tree<Integer>> q = new LinkedList<Tree<Integer>>();
    HashSet<Tree<Integer>> visited = new HashSet<Tree<Integer>>();
    q.add(t);

    while (q.size() > 0) {
        System.out.println(q.peek().value);
        if (q.peek().left != null && !visited.contains(q.peek().left)) {
            // if left child, continue
            q.addFirst(q.peek().left);
        } else {
            Tree<Integer> current = q.poll();
            visited.add(current);
            if (k == 1) {
                return current.value;
            }
            k--;
            if (current.right != null && !visited.contains(current.right)) {
                q.addFirst(current.right);
            }
        }
    }

    return 0;
}*/
