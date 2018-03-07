// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {
    a = reverseList(a);
    b = reverseList(b);

    ListNode<Integer> r = new ListNode(0);
    ListNode<Integer> curr = r;
    ListNode<Integer> prev = null;
    int previousRemaining = 0;

    while (a != null || b != null) {
        int temp = previousRemaining;
        if (a != null) {
            temp += a.value;
            a = a.next;
        }
        if (b != null) {
            temp += b.value;
            b = b.next;
        }

        curr.value = temp % 10000;
        previousRemaining = (int)Math.floor(temp / 10000);

        curr.next = new ListNode(0);
        prev = curr;
        curr = curr.next;
    }

    curr.value += previousRemaining;

    if (prev != null && curr.value == 0) {
        prev.next = null;
    }

    return reverseList(r);
}

ListNode<Integer> reverseList(ListNode<Integer> l) {

    ListNode<Integer> prev = null;
    ListNode<Integer> current = l;
    ListNode<Integer> next = null;

    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }

    return prev;
}
