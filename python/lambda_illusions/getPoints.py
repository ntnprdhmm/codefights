def getPoints(answers, p):
    questionPoints = lambda i, ans: -p if not ans else (i+1)

    res = 0
    for i, ans in enumerate(answers):
        res += questionPoints(i, ans)
    return res
