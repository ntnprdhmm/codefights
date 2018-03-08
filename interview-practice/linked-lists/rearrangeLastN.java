// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> rearrangeLastN(ListNode<Integer> first, int n) {
    // nothing to do
    if (first == null || n == 0) return first;

    // find the length of the list and the last node
    int length = 1;
    ListNode<Integer> last = first;
    while (last.next != null) {
        length++;
        last = last.next;
    }

    // nothing to do
    if (length == 1 || length == n) return first;

    // find the new last node and the new first node
    ListNode<Integer> newLast = first;
    ListNode<Integer> newFirst = first.next;
    int newFirstIndex = 1;
    while (newFirstIndex < length-n) {
        newLast = newFirst;
        newFirst = newFirst.next;
        newFirstIndex++;
    }

    // cut the link between the new last and new first
    newLast.next = null;
    // link last node to the first node
    last.next = first;

    // return the new first node
    return newFirst;
}
