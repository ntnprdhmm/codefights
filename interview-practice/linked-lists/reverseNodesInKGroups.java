// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> reverseNodesInKGroups(ListNode<Integer> l, int k) {
    return reverse(l, k);
}

ListNode<Integer> reverse(ListNode<Integer> head, int k) {

    ListNode<Integer> current = head;
    ListNode<Integer> prev = null;
    ListNode<Integer> next = null;

    int count = 0;

    while (current != null && count < k) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        k++;
    }

    if (next != null) {
        head.next = reverse(next, k);
    }

    return prev;
}
