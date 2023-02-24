public class Strings {
    
    
    public static void revString( StringBuilder str ){
        int i , j;

        for ( i=0,j=str.length()-1-i ; i < str.length()/2 ; i++ , j-- ){
            char firstChar = str.charAt(i);
            char lastChar = str.charAt(j);

            str.setCharAt(i, lastChar);
            str.setCharAt(j, firstChar);
        }

        System.out.println(str);


    }


    public static boolean isPalindrome( StringBuilder str ){
        
        int i , j;
        
        for ( i=0 , j=str.length()-1-i ; i < str.length()/2 ; i++ , j--  ){
            if ( str.charAt(i) != str.charAt(j)){
                return false;
            } 
        }
        
        return true;
    }
    
    
    public static void floRida( String a ){
        int i ;
        for ( i=0;i<a.length()-1 ; i++ ){
            a.charAt(i = a.charAt(i)+32);
        }
        System.out.println(a);
    }
    
    public static void len(String a){
        int i = 0;
        for ( i=0 ; i< a.length() ; i++ ){
        }
        System.out.println(i);
    }

    public static void lenChar( char []b ){
        int i = 0;
        for ( i = 0 ; i < b.length ; i++ ){

        }
        System.out.println(i);
    }
    
    
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("ololo");
 
        System.out.println(isPalindrome(str)); 
        
        
        
    }
}