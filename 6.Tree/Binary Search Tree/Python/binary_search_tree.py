class Node:
    def __init__(self, value):
        self.left = None
        self.value = value
        self.right = None

class BST:
    def __init__(self):
        self.root = None

    # insertion in binary search tree
    def insert(self, value):
        if self.root is None:
            self.root = Node(value)
            return
        temp = self.root
        while temp:
            if temp.value == value:
                print(f"inserion failed, value exist {value}")
                return
            if temp.value > value:
                if not temp.left:
                    temp.left = Node(value)
                    return
                temp = temp.left
            else:
                if not temp.right:
                    temp.right = Node(value)
                    return
                temp = temp.right
                
    # deletion from binary search tree
    def deleteNode(self, value):
        return
               
    # searching in binary search tree 
    def searchWrap(self, root, value):
        if root is None or root.value == value:
            return root
        if root.value < value:
            return self.searchWrap(root.right, value)
        return self.searchWrap(root.left, value) 
        
        
    def search(self, value):
        root = self.searchWrap(self.root, value)
        if root is None:
            print(f"Not found in tree {value}")
        else:
            print(f"Found in tree {value}")
        
        
    def inorder(self, root: Node):
        if root:
            self.inorder(root.left)
            print(root.value, end=" ")
            self.inorder(root.right)
        
    def showBST(self, msg):
        print(msg)
        self.inorder(self.root)
        print()
        
        
if __name__ == "__main__":
    bt = BST()
    bt.insert(30)
    bt.insert(50)
    bt.insert(15)
    bt.insert(20)
    bt.insert(10)
    bt.insert(40)
    bt.insert(10)
    bt.insert(60)
    bt.showBST("before")
    # bt.showBST("after delete")
    bt.search(15)
    bt.search(400)