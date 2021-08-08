# Create Node class containing 
# data
# left pointer
# right pointer

class Node:
    def __init__(self, value):
        self.value = value
        self.right = None
        self.left = None
    
class BinaryTree:
    def __init__(self):
        self.root = None
    
    def insert(self, value):
        if not self.root:
            self.root = Node(value)
            return
        
        q = []
        q.append(self.root)
        
        while len(q):
            temp = q[0]
            q.pop(0)
            
            if not temp.left:
                temp.left = Node(value)
                break
            else:
                q.append(temp.left)
            if not temp.right:
                temp.right = Node(value)
                break
            else:
                q.append(temp.right)
                
    def print_order(self, temp, order):
        if temp is None:
            return
        if order == "pre":
            print(f"{temp.value}", end=" ")
        self.print_order(temp.left, order)
        if order == "in":
            print(f"{temp.value}", end=" ")
        self.print_order(temp.right, order)
        if order == "post":
            print(f"{temp.value}", end=" ")
            
    def traverse_by_stack(self, root):
        current = root
        stack = []
        while True:
            if current: 
                stack.append(current)
                current = current.left
            elif stack:
                current = stack.pop()
                print(current.value, end=" ")
                current = current.right
            else:
                break
        print()
       
    def showTree(self, msg, type=None):
        print(msg)
        if type is None:
            print("not implemented yet")
        elif type == "stack":
            self.traverse_by_stack(self.root)
        else:
            self.print_order(self.root, type)
            print()
        
    def popDeep(self, lastNode):
        q = []
        q.append(self.root)
        
        while len(q):
            temp = q[0]
            q.pop(0)
            
            if temp == lastNode:
                temp = None
                return
            if temp.left == lastNode:
                temp.left = None
                return
            else:
                q.append(temp.left)
            if temp.right == lastNode:
                temp.right = None
                return
            else:
                q.append(temp.right)
            
            
            
    def delete(self, value):
        if not self.root:
            return 
        if not self.root.left and not self.root.right:
            if self.root == value:
                self.root = None
            return
        q = []
        q.append(self.root)
        
        d = None
        
        while len(q):
            temp = q[0]
            q.pop(0)
            
            if temp.value == value:
                d = temp
            if temp.left:
                q.append(temp.left)
            if temp.right:
                q.append(temp.right)

        if d:
            x = temp.value
            self.popDeep(temp)
            d.value = x
        
        

if __name__ == "__main__":
    bt = BinaryTree()
    bt.insert(10)
    bt.insert(11)
    bt.insert(9)
    bt.insert(7)
    bt.insert(12)
    bt.insert(15)
    bt.insert(8)
    bt.showTree("before", "in")
    bt.delete(8)
    bt.showTree("after", "in")
    print("with orders")
    bt.showTree("Preorder", "pre")
    bt.showTree("Inorder", "in")
    bt.showTree("stack", "stack")
    bt.showTree("Postorder", "post")
                
        
    
    