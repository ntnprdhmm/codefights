def isTestSolvable(ids, k):
    digitSum = lambda n: sum(int(v) for v in str(n))

    sm = 0
    for questionId in ids:
        sm += digitSum(questionId)
    return sm % k == 0
