

def duplicate_hash( arr):

    new_arr = []

    for i in range ( len(arr)-1 ):
        new_arr[ arr[i] ] +=1

    for i in range ( max(arr)-1 ):
        if arr[i] > 1:
            print( i )


def duplicate( arr ):
    '''
    This checks for a duplicate element in an array 
    and if the element is duplicated more than once 
    , we dont have to print it
    also we are counting how many times there are duplicates in this array 
    '''

    last_duplicate = 0;

    for i in range( len(arr)-1 ):
        if ( arr[i] == arr[i+1] & arr[i] != last_duplicate ):
            print( arr[i] )
            last_duplicate = arr[i]

def find( arr ):
    n = len(arr)  
    m = max(arr)   
    res = [0]*(m+1)  
    
    for i in range (m):     
        res[ arr[i] ]+=1  

    for j in range ( m+1):  
        if res[j] == 0:
            print( j )



def find_slower( arr ):
    
    '''
         but slow* This is for finding multiple numbers in a range which can be missing 
    '''
    
    i=0
    diff = arr[0] - i               #   6,7,9,10,11,14,15,16
    for i in range( len(arr) ):
        if arr[i]-i != diff:   # 7

            while diff < arr[i]-i:  # 6 <  7   7 <
                print( diff + i )  # 6+1=7 , 
                diff+=1



def find_any_range( arr ):
    '''
     This is for numbers from any range 
    '''
    
    i=0
    diff = arr[0] - 0

    for i in range ( len(arr) ):
        if ( arr[i] != diff ):
            print( arr[i] + diff )
            break


def find_first_natural_nos( arr ):
    '''
        this is for first natural numbers only 
    '''
    i=0
    sum = 0 
    n = arr[len(arr)-1]    
    for i in range ( len(arr) ):
        sum = sum + arr[i]

    s = n*(n+1)/2  

    result = s - sum

    return result 

arr = [6,7,8,9,9,10,11,11,34]
print( duplicate_hash( arr ) )
    
