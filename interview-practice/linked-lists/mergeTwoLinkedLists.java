// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
    if (l1 == null && l2 == null) return null;

    ListNode<Integer> l = new ListNode(0);
    ListNode<Integer> p = l;

    while (l1 != null && l2 != null) {
        if (l1.value < l2.value) {
            p.value = l1.value;
            l1 = l1.next;
        } else {
            p.value = l2.value;
            l2 = l2.next;
        }
        p.next = new ListNode(0);
        p = p.next;
    }

    if (l1 == null) {
        p.value = l2.value;
        p.next = l2.next;
    } else {
        p.value = l1.value;
        p.next = l1.next;
    }

    return l;
}
