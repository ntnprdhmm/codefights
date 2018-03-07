// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
    ListNode<Integer> p = l;
    // go to the first node != k
    while (p != null && p.value == k) {
        p = p.next;
    }
    l = p;

    while (p != null) {
        if (p.next != null && p.next.value == k) {
            p.next = p.next.next;
        } else {
            p = p.next;
        }
    }

    return l;
}
