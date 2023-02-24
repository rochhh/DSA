public class Strings {
    
    
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
        
        String a  = "WELCOME" ;
        
        floRida(a);
        
    }
}