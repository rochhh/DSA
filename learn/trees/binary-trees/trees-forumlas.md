total possible # binary trees given 'n' nodes - 

* catalan number = 2^n Cn /  n + 1  ->  combination formula 

* resursive formula to calculate catalan number -> 

T(n) = Summation {i=1 -> n}  T(i-1) * T( n-i )

max height of 'n' nodes = 2 ^ n-1

NOTE - for considering labelled nodes we multiply the above formulas with n! 
       eg : abc nodes as n=3 , it's permutation is 3! or n! 

       so the catalan formula can be updated for labelled nodes as follows -

       * catalan number = ( 2^n Cn /  n + 1 ) * n!

       where ( n+1 ) represents the shapes possible for 'n' nodes && 

       n! repr the permutations of it .  


-----


Height vs Nodes in Binary Trees

analysis to be done - given Height of a tree , what is the min/max # nodes possible && Vice-Versa . 

min nodes possible given the height of the Tree - 

    * min nodes (nMin) = h + 1 ; where h is the height of the tree 

    * max nodes ( nMax ) = 2^(h+1) - 1 . ; this is obtained through Geometric Progression formula . 


analysis to be done - given Node of a tree , what is the Height of the Tree ( min && max )

    * max Height ( hMax ) = n-1

    * min Height ( hMin ) = log ( n+1) -1 ; this was calculated as ;
                                           we see a pattern b/w nMin && hMax ( n = h+1 && h = n-1 )
                                           following similar approach we use for nMax && hMin , we get the calculated result as seen above 

-----


Relationship b/w degree of nodes in a binary tree - deg(0) , deg(1) , deg(2)

    * deg(0) = deg(2) + 1


Talking about the relations b/w height and nodes in strict binary tree ( {0,2} childs  )


    * nMin = 2h + 1 
    * nMax = 2 ^ (h+1)-1

    * hMin = log (n+1) -1                               Strict binary trees 
    * hMax = (n-1)/2 

Leaf nodes ( e ) and non leaf nodes ( i ) relationship 


    * e = i + 1   



------

n-ary trees analysis ( strict )

NOTE- 'n' is the # nodes && 'm' is the degree of it 

    * nMin = mh + 1                                     where h is the height of the tree &&  n -> node 

    * nMax = m ^ ( h + 1 ) / (m -1)

    LEAF NODES ( e ) AND INTERNAL NODES RELATIONSHIP ( m ) ->  

    * e = ( m - 1 ) i + 1 


--------------

Array repr of a Binary Tree -> 

let element = i 

    then ; left child = 2*i
    && right child = (2*i) + 1 