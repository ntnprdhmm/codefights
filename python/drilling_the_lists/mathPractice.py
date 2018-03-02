from functools import reduce

def mathPractice(numbers):
    return reduce(lambda a, t: a*t[1] if t[0]%2==1 else a+t[1], enumerate(numbers[1:]), numbers[0])
