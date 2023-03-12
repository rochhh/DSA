
def quick_sort( arr : list ):
    length = len(arr)

    if length <= 1:
        return arr
    
    else:
        pivot = arr.pop()

        arr_greater = []
        arr_smaller = []

        for item in arr:
            if item > pivot:
                arr_greater.append(item)
            elif item < pivot:
                arr_smaller.append(item)
        
        return quick_sort( arr_smaller) + [pivot] + quick_sort( arr_greater )
    

arr = [6,4,8,1,2,9]
arr_s = quick_sort(arr)

print(arr_s)