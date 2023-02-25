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
 
    public static void display( int []arr ){
        for ( int i=0 ; i< arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int []arr = {11,2,3,22,13,4,33,4,12,18};
        reverseArray(arr);
        
    }
}