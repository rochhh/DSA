public class LL{
    public class Node{
        int data;
        Node next;
    } 

    public static void display( Node p ){
        while ( p != null ){
            System.out.println( p.data );
            p = p.next;
        }
    }

    public static void main(String[] args) {
        
        
        System.out.println(1+1);   
	System.out.println("Linked-List");
    }
}
