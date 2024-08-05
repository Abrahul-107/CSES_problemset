def returnDistinctElement(nums,n):
    for i in range(1,n):
        if(nums[i]==nums[i-1]):
            return nums[i]
        
nums = [2,3,2,2,4]
n = 5
print(returnDistinctElement(nums,n))