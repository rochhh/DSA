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
