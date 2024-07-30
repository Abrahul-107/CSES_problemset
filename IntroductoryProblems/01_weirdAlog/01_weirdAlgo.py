def weirdAlgo(n):
    while(n>1):
        print(n)
        if(n&1):
            n = n*3+1
        else:
            n>>=1
    print(1)
    
n = int(input())
weirdAlgo(n)