
def selection_sort(A):
    for i in range(len(A)-1):
        j = k = i
        for j in range(i, len(A)):
            if A[j] < A[k]:
                k = j
        A[i], A[k] =  A[k] , A[i]
    return A

arr = [76,75,54,32,2]

arr_s=selection_sort(arr)

print(arr_s)