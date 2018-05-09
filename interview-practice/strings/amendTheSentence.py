import re
def amendTheSentence(s):
    return ' '.join(re.findall('([A-Z][^A-Z]*|^[^A-Z]*)', s)).lower()
