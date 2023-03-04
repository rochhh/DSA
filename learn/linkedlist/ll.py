class Node:
    def __init__(self , data) -> None:
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self,head=None) -> None:
        self.head = head

    def display(self):
        p = self.head

        while p != None:
            print( p.data )
            p = p.next 

    def recursive_display(self):

        p = self.head
        if p.next == None:
            

