def single_number(nums):
    ''' Works for +ve indices only '''
    counts = [0] * 100 
    
    for num in nums:
        counts[num] += 1 
    
    for i in range(len(counts)):
        if counts[i] == 1:
            return i 

def correct_single_number(nums):
    
    for i in range( len(nums) + 1 ):
        if nums.count(nums[i]) == 1:
            return nums[i]

arr = [4,1,2,1,2]
print( correct_single_number(arr) )