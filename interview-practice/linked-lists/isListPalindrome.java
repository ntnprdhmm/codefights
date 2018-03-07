// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
boolean isListPalindrome(ListNode<Integer> l) {
    // find list length
    int length = 0;
    ListNode<Integer> p = l;
    while (p != null) {
        length++;
        p = p.next;
    }

    // find middle node
    ListNode<Integer> m = l;
    for (int i = 0; i < Math.ceil(length / 2); i++) {
        m = m.next;
    }

    // reverse the second half
    ListNode<Integer> prev = null;
    ListNode<Integer> current = m;
    ListNode<Integer> next = null;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    m = prev;

    // go throught both halves
    while (m != null) {
        if (!new Integer(m.value).equals(new Integer(l.value)))
            return false;
        m = m.next;
        l = l.next;
    }

    return true;
}
