from functools import reduce

def compose(functions):
    return reduce(lambda acc, f: lambda x: acc(f(x)), functions, lambda x: x)

def functionsComposition(functions, x):
    return compose(map(eval, functions))(x)
