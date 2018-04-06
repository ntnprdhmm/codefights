from heapq import heappush, heappop

def nextLarger(arr):
    t = []
    for i in range(len(arr)-1):
        flag = False
        for j in range(i+1, len(arr)):
            if arr[j] > arr[i]:
                t.append(arr[j])
                flag = True
                break
        if not flag:
            t.append(-1)
    return t + [-1]
