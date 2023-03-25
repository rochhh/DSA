def contains_duplicate(arr):
    s = set()

    for i in nums:
        if i in s:
            return True
        else:
            s.add(i)
    return False


nums = [1,2,3,4]

print( contains_duplicate(nums) )