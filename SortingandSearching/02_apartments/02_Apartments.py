n, k, x = map(int, input().split())

desired = [int(input()) for _ in range(n)]
given = [int(input()) for _ in range(k)]

desired.sort()
given.sort()

i = 0
j = 0
c = 0

while i < n and j < k:
    if abs(desired[i] - given[j]) <= x:
        i += 1
        j += 1
        c += 1
    elif desired[i] < given[j]:
        i += 1
    else:
        j += 1

print(c)
