def find_dis_nums(arr):
    s1 = set()
    s2 = set()

    n = len(arr)

    for i in range ( 1 , n+1 ):
        s1.add(i)
    for number in arr:
        s2.add(number)

    return s1.difference(s2)

arr = [4,3,2,7,8,2,3,1]

print( find_dis_nums(arr) )