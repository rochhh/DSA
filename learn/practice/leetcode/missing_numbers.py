def missing_numbers(arr):
    n = len(arr)
    
    for i in range(n+1):
        if i not in arr:
            return i

arr = [0,1] 

print( missing_numbers(arr) )