#https://cses.fi/problemset/task/1094

def increasingArray(arr):
    count = 0
    for i in range (1,len(arr)):
        if(arr[i]<arr[i-1]):
            count+= (arr[i-1]-arr[i])
    return count
    
    
arr = [3,2,5,1,7]
print(increasingArray(arr))