class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
    def __len__(self):
        if self.head == None:
            return 0
        i = 0
        temp = self.head
        while temp != None:
            i += 1
            temp = temp.next  
        return i
    # insert element in linked list
    def insert(self, value):
        node = Node(value)
        node.next = self.head
        self.head = node
        
    # append element at end of linked list
    def append(self, value):
        temp = self.head
        if temp == None:
            self.head = Node(value)
        else:
            while temp.next:
                temp = temp.next
            temp.next = Node(value)
    
    #delet node form linked list
    def delete(self, value):
        temp = self.head
        if temp != None and temp.value == value:
            self.head = temp.next
            return
        while temp != None:
            if temp.value == value:
                pre.next = temp.next
                break
            pre = temp
            temp = temp.next
            
    #delete at perticular location
    def deleteAt(self, pos):
        temp = self.head
        pre = None
        if pos == 1:
            self.head = temp.next
            return
        for i in range(pos - 1):
            pre = temp
            temp = temp.next
            if temp == None:
                print(f"out of range {pos}")
        pre.next = temp.next
            
            
            
        
    # print linke list   
    def showLinkedList(self):
        temp = self.head
        if temp == None:
            print("Linkedlist is empty, add some elementst")
        else:
            print("head", end="")
            while temp != None:
                print(f"->{temp.value}", end="")
                temp = temp.next
            print()

l = LinkedList()
l.insert(10)
l.insert(101)
l.insert(78)
l.insert(34)
l.append(211)
l.showLinkedList()
print(len(l))
l.delete(34)
l.deleteAt(2)
l.deleteAt(1)
l.showLinkedList()
print(len(l))