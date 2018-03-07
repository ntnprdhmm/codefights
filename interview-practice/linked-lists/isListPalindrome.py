# Definition for singly-linked list:
# class ListNode(object):
#   def __init__(self, x):
#     self.value = x
#     self.next = None
#
def isListPalindrome(l):
    # find list length
    length = 0
    p = l
    while p:
        length += 1
        p = p.next

    # find middle node
    m = l
    for _ in range(math.ceil(length / 2)):
        m = m.next

    # reverse the second half
    prev = None
    current = m
    next = None
    while current:
        next = current.next
        current.next = prev
        prev = current
        current = next
    m = prev

    # go throught both halves
    while m:
        if m.value != l.value: return False
        m = m.next
        l = l.next

    return True
