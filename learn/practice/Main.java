import java.util.*;

public class Main { 
    
    
    
    public static void minMax( int []arr ){
 
        int min = arr[0];
        int max = arr[0];

        for ( int i=0 ; i< arr.length ; i++ ){
            if ( arr[i] > max ) max = arr[i];
            if ( arr[i] < min ) min = arr[i];
        }
        System.out.println("min ->" + " " + min + " " + "max" + " " + max );

    }

    public static void reverseArray( int []arr ){

        for ( int i = 0 ,  j = arr.length-1 ; i < arr.length/2 ; i++ , j-- ){
            int temp;   
            temp = arr[i];  
            arr[i] = arr[j];  
            arr[j] = temp;  
        }
        display(arr);

    }

    public static int bruteForceMaxSumSubArray( int []arr ){
        int max = arr[0];
    
        for ( int i=0 ; i< arr.length ; i++ ){
            int currSum = 0;

            for ( int j = i ; j< arr.length ; j++ ){
                currSum+=arr[j];
                max = Math.max(max, currSum);
            }
        }
        return max;
    }


    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int max = nums[0];

        for ( int i=1 ; i< nums.length ; i++ ){
            if ( curr >=0 ){
                curr += nums[i];
            }else{
                curr = nums[i];
            }
            if ( curr > max ){
                max = curr;
            }
        }
    return max;
    }

    public static boolean containsDuplicate( int []arr ){
        
        HashSet<Integer> hash = new HashSet<>();

        for ( int i =0 ; i<arr.length ; i++ ){
            // searches the hashset to find the duplicate 
            if ( hash.contains(arr[i]) ) return true;
            // if not found it will add in the hashset
            hash.add(arr[i]);
        }
        
        return false;
    }

 
    public static void display( int []arr ){
        for ( int i=0 ; i< arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    }

    

    public static void main(String[] args) {
        int []arr = {1,2,3,-1,4,8};
        System.out.println(containsDuplicate(arr)); 
        // display(arr);
    }
}