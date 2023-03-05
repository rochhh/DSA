#include <stdio.h>
#include <stdlib.h>

struct Node{
 struct Node *prev;
 int data;
 struct Node *next;   
} *first = NULL ;

void create ( int a[] , int n ){
    struct Node *t , *last;
    int i;

    first = (struct Node*)malloc( sizeof(struct Node) );
    first->data = a[0];
    first->prev = first->next = NULL;
    last = first;

    for ( i=1 ; i<n ; i++ ){
    t = (struct Node*)malloc( sizeof(struct Node) );
    t->data = a[i];
    t->next = last->next;
    t->prev = last;
    last->next = t;
    last = t;
    }
}

void display( struct Node *p ){
    while(p){
        printf("%d\n", p->data );
        p = p->next;
    }
}

int length( struct Node *p ){
    int len = 0;
    while(p){
        len++;
        p=p->next;
    }
    return len;
}

int main(int argc, char const *argv[]){
   int a[] = {1,2,3,4};
   create(a,4);
   display(a);
   printf( "%d\n" , length(first) ); 
    return 0;
    }