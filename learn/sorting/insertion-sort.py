def insertion_sort(arr):
    
    for i in range( 1 , len(arr) ):
        while arr[i-1] > arr[i] and i > 0:
            arr[i-1] , arr[i] = arr[i] , arr[i-1]
            i = i-1
    return arr


arr = [7,6,5,4 ,3 ,9 ,12 , 1 ]
sorted_arr = insertion_sort(arr)

print(arr)