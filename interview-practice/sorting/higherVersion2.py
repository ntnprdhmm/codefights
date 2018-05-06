def higherVersion2(ver1, ver2):
    s_v1 = list(map(int, ver1.split('.')))
    s_v2 = list(map(int, ver2.split('.')))
    for i in range(len(s_v1)):
        if s_v1[i] != s_v2[i]:
            return 1 if s_v1[i] > s_v2[i] else -1
    return 0
