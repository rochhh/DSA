public class ArrayADT {
    
    public static int linearSearch( int []arr , int key ){
        
        for ( int i = 0 ; i < arr.length ; i++ ){
            if ( arr[i] == key ){
                return i;
            }
        } 
        // transposition 

        /*
         * if ( arr[i] == key ){
         *      swap( arr[i] , arr[i-1] );        
         *   }
         *     return i;
         */

         // some other shit where we move the key to the head ; 

         /*
          *  if ( arr[i] == key ){
              swap ( arr[i] , arr[0] )
            }
            return i;
          */
        
        return 0;
    }

    public static void display ( int []arr  ){
        for ( int i = 0 ; i<arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    
    }
    
    public static void add( int []arr , int num ){
        int length = arr.length;
        arr[length] = num;
        length++;
    }

    public static void insert( int []arr , int index , int num ){
        int length = arr.length;
        for ( int i = length ; i > index ; i-- ){
            arr[i] = arr[i-1];
            arr[index] = num;
            length++;
        }
    } 

    public static int delete ( int []arr , int index ){
        int length = arr.length;
        for ( int i = index ; i < length-1 ; i++ ){
            arr[i] = arr[i+1];
        }
        length--;
        return index;
    }

    public static int rbinSearch( int []arr , int key , int start , int end ){
        
        /* Through Recursion */

        if ( start <= end ){
            int mid = (start + end)/2;

            if ( arr[mid] == key ) return mid;
            if ( arr[mid] > key ){
                return rbinSearch(arr, key, start, mid-1);
            }
            else if ( arr[mid] < key ){
                return rbinSearch(arr, key, mid+1, end);
            }
        }
        
        return -1;
    }

    public static int binSearch( int []arr , int key , int f , int l ){
        
        /* Through Iteration  */

        while ( f <= l ){
            int mid = (f+l)/2;
            
            if ( arr[mid] == key ) return mid;
            if ( arr[mid] > key ){
                l = mid -1;
            }
            if ( arr[mid] < key  ){
                f = mid+1;
            }
        }
        
        return -1;
    }

    public static int sum( int []arr ){
        /*  iterative approach to find the sum */
        
        int total = 0;

        for ( int i = 0 ; i<arr.length ; i++ ){
            total = total + arr[i];
        }

        return total;
    }

    public static int rsum( int []arr , int n ){

        /* recursion to find the sum  */

        if (n < 0 ) return 0;
        return rsum( arr , n-1 )+arr[n];
    }

    public static int get( int []arr , int index ){
        return arr[index];
    }

    public static void set( int []arr , int index , int value  ){
        arr[index] = value; 
    }

    public static int max( int []arr ){
        
        int max = arr[0];

        for ( int i = 1 ; i<arr.length ; i++ ){
            if ( arr[i] > max ){
                max = arr[i];
            }
        }
        
        return max;
    }

    public static void reverseArray( int []arr ){
        for ( int i = 0 , j = arr.length-1 ; i < arr.length ; i++ , j-- ){
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
    }

    public static void rev( int []arr ){
        int []arr2 = new int[arr.length];

        for ( int i = 0 , j = arr.length-1 ; i <=j ; i++ , j-- ){
                arr2[j] = arr[i]; 
        }

        for ( int i = 0 ; i < arr.length; i++ ){
                arr[i] = arr2[i];
                System.out.println(arr[i]);
        }
    }


    public static void duplicate( int []arr ){
        int lastDuplicate = 0;

        for ( int i=0 ; i< arr.length-1; i++ ){             /*  this second for loop is sus ignore that if you want running code */
            
            for ( int j=0 ; j<arr.length-1 ; j++  ){
                if ( arr[i] == arr[i+1] ){
                    j = i+1;
                    while ( arr[j] == arr[i] ) j++;
                    System.out.println( j-i );
                    i = j-1;
                }
            }
            
            
            if ( arr[i] == arr[i+1] && arr[i] != lastDuplicate ){
                System.out.println(arr[i]);
                lastDuplicate = arr[i];
            }
        }

    }

    public static void main(String[] args) {
       int []arr = {1,2,2,3,4,5,5,6};
        // System.out.println( reverse(arr) );
        duplicate(arr);
    }
}


