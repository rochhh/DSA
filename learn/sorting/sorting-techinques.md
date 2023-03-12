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
Adaptive - In it's default nature , NO it's not adaptive but it can be ; Yes, by creating a var flag = 0 , before the 2nd loop and   increment it to 1 if swap is done 
           if the swapping is done , check for the output in the 2nd loop if flag still 0 we break the loop | return;

stable - yes 
min time - O(n) for sorted arr
max time - O(n^2)
Intermediate results can be helpful as it provides info of the first 'k' numbers which are sorted 
-----

Insertion sort ( designed for LinkedList )

analogy - insertion of an element in a sorted array in a sorted position 

comparisions - O(n^2)
swaps - O(n^2)
Adaptive - Yes , by default in it's nature 
Stable - YES 

------


Selection sort 
Best for it's least # swaps 

comparisons - O(n^2)
swaps - O(n)
Adaptive - NO
Stable - No 

Intermediate results can be helpful as it provides info of the first 'k' numbers which are sorted 

-----

Quick Sort 

analogy - idea where the element in a list is in a sorted position if the elements to the right of it are greater than 
          it and the elements in the left are smaller than it . 

lmao worst case scenario of quick sort is when a list is already sorted in ascending && descending order , it takes O(n^2) time still ! 

------ 

Merge Sort

analogy - Q : merge a list with 8 elements , Merge sort - Hold my beer , merge 8 lists having 1 element 