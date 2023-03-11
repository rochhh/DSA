Criteria for analysis -

1. # comparisions 
2. # swaps 
3. Adaptive i.e if array is sorted , how efficient is it to know that it is already sorted 
4. Memory 
5. stable i.e preserving the order of duplicate elements in a sorted list ( use_case -> DB )

comparison based => 
    Bubble , insertion , selection sort -> O(n^2)
    shell sort -> O( n^ 3/2 )
    heap , merge , tree , quick sort -> O( n^2 )

Index based sorts =>
    count , bucket/bin , radix sort -> O( n ) but memory hogs 



-----


Bubble sort 

comparisons - O( n^2 )
swaps - O(n^2)
Adaptive - Yes , by creating a var flag = 0 , before the 2nd loop and increment it to 1 if swap is done 
           if the swapping is done , check for the output in the 2nd loop if flag still 0 we break the loop | return;

stable - yes 
min time - O(n) for sorted arr
max time - O(n^2)

-----

Insertion sort ( designed for LinkedList )

analogy - insertion of an element in a sorted array in a sorted position 

comparisions - O(n^2)
swaps - O(n^2)
