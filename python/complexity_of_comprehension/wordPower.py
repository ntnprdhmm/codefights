def wordPower(word):
    num = {c:(i+1) for i, c in enumerate(string.ascii_lowercase)}
    return sum([num[ch] for ch in word])

