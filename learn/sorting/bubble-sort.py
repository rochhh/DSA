
def swap( a , b ):
    temp = b
    b = a 
    a = temp


def bubble_sort(arr):
    
    for i in range( len(arr) ):
        flag = 0  # adaptive 
        for j in range( len(arr)-1-i ):
            if arr[j] > arr[j+1]:
                temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
                flag = 1
        if flag == 0:
            break

arr = [4,3,2,1]
bubble_sort(arr) 
print(arr)