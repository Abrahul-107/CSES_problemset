#https://cses.fi/problemset/task/1083
def missingNumber(n,arr):
    xor = 0
    for i in range(1,n+1):
        xor ^= i
    for i in arr:
        xor ^= i
    return xor

n = 5
arr = [2, 3, 1 ,5]
ans = missingNumber(n,arr)
print(ans)
