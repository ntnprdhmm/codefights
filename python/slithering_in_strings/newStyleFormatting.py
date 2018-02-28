def newStyleFormatting(s):
    return '%'.join([re.sub(r'%[a-zA-Z^xs]', '{}', t) for t in s.split('%%')])
