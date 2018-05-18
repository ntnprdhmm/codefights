def sumInRange(nums, queries):
    c = [0]
    for num in nums:
        c.append(c[-1] + num)
    r = 0
    for q in queries:
        r += c[q[1]+1] - c[q[0]]
    return r % 1000000007
