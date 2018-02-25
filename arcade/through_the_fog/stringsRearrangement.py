import itertools

def count_differences(s1, s2):
    c = 0
    for i in range(len(s1)):
        if s1[i] != s2[i]:
            c += 1
    return c

def stringsRearrangement(arr):
    # loop throught permutations (bruteforce)
    for perm in list(itertools.permutations(arr)):
        # check if strings differ by exactly one character
        flag = False
        for i in range(1, len(perm)):
            c = count_differences(perm[i-1], perm[i])
            if c != 1:
                flag = True
                break
        if not flag:
            return True
    return False
