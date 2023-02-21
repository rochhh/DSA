public class ArraySortedMethods {
    
    /* Q1 to insert a number in a sorted array 
     * eg:  insert( arr , value=4 ) in { 1,2,3,5,}; -> { 1,2,3,4 ,5}
      */

    public static void insert( int []arr , int value ){
        
        
        int i = arr.length-1;

        while( i>=0 && arr[i] > value ){
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = value;
        
        
        
        // int i;
        // for (i = arr.length - 1; i >= 0 && arr[i] > value; i--) {
        //     arr[i + 1] = arr[i];
        // }
        //     arr[i + 1] = value;
    }

      /*  Q2 check if an array is sorted  */
    
      public static boolean isSorted( int[] arr ){
        
        for( int i=0; i< arr.length-1; i++){
            if ( arr[i] > arr[i+1] ) {
                return false;
            }
        }
        return true;
      }


      /* Q3 -ve numbers on one side and positive numbers on other side 
       * eg :  {1,-2,3,-6,5} -> {-2,-6,1,3,5 }
        */
      
      public static void neg( int arr[] ){
        for ( int i = 0 , j= arr.length-1 ; i < arr.length ; i++,j-- ){
            if ( arr[i] > 0 ){
                arr[i] = arr[j];
            }
            if ( arr[i] < 0 ){
                arr[j] = arr[i];
            }
            System.out.println(arr[i]);   
        }
      } 

      public static int[] merge( int []arr , int []arr2 ){
        int []newArr = new int[10];

        int i=0 , j=0 ,k=0;

        while ( i < arr.length && j < arr2.length ){
            if ( arr[i] < arr2[j] ){
                newArr[k++] = arr[i++];
            }
            if ( arr[i] > arr2[j] ){
                newArr[k++] = arr2[j++];
            }
        }

        for ( ; i<arr.length ; i++ ){
            newArr[k++] = arr[i++];
        }
        for ( ; j<arr2.length ; j++ ){
            newArr[k++] = arr[j++];
        }

        return newArr;
      }

    public static void main(String[] args) {
        
        //ArrayList<Integer> list = new ArrayList<>();
        int []arr = {1,2,3,4};
        int []arr2 = {5,6,7,8};
        System.out.println( merge( arr , arr2 ) );
       
    }
}
