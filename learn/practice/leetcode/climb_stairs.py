def climb_stairs(n):
    ''' works but time exceded '''
    if n == 1:
        return 1
    if n == 2 : 
        return 2
    return climb_stairs(n-1) + climb_stairs(n-2)

n = 8

print( climb_stairs(n) )