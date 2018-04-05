def decodeString(s):
    res, _ = decodeStringRec(s, 0)
    return res

def decodeStringRec(s, i, nb=1):
    nb_temp = ""
    s_temp = ""
    while i < len(s):
        if s[i].isdigit():
            nb_temp += s[i]
        elif s[i] == '[':
            substring, i = decodeStringRec(s, i+1, int(nb_temp))
            s_temp += substring
            nb_temp = ""
        elif s[i] == ']':
            break
        else:
            s_temp += s[i]
        i += 1
    return nb * s_temp, i
