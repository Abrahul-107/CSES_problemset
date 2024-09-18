def repetitons(s):
    n = len(s)
    best = curr =1 
    for i in range(1,n):
        if(s[i]==s[i-1]):
            curr+=1
        else:
            curr = 1
        best = max(curr,best)
    return best

s = "ATTCGGGA"
print(repetitons(s))