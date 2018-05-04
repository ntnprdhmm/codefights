values = []

def digitTreeSum(t):
    digitTreeSumRec(t, '0')
    print(values)
    return sum(values)

def digitTreeSumRec(t, n):
    if not t:
        return None
    n += str(t.value)
    # if child, stop here
    if not t.left and not t.right:
        values.append(int(n))
    else:
        digitTreeSumRec(t.left, n)
        digitTreeSumRec(t.right, n)
