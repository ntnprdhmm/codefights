memo = {}

def fillingBlocks(n):
    if n <= 0:
        return 0
    if n == 1:
        return 1
    if n == 2:
        return 5
    if n == 3:
        return 11
    if n == 4:
        return 36
    if n not in memo:
        memo[n] = fillingBlocks(n-1) + 5*fillingBlocks(n-2) + fillingBlocks(n-3) - fillingBlocks(n-4)
    return memo[n]
