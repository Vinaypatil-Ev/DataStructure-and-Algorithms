class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
        
class BTree:
    def __init__(self):
        self.root = None
    
    def insert(self, value):
        if not self.root:
            self.root = Node(value)
            return
        q = [self.root]
        while q:
            temp: Node = q.pop(0)
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
                
    def inorderWrap(self, temp):
        if temp:
            self.inorderWrap(temp.left)
            print(temp.value, end=" ")
            self.inorderWrap(temp.right)
    def inorder(self):
        self.inorderWrap(self.root)
        print()
        
    # sum of tree elements
    def tree_sum_wrap(self, temp):
        if temp is None:
            return 0
        else:
            left_sum = self.tree_sum_wrap(temp.left)
            right_sum = self.tree_sum_wrap(temp.right)
            return temp.value + left_sum + right_sum
    def tree_sum(self):
        x = self.tree_sum_wrap(self.root)
        print("sum of all elements", x)
    
    #max in tree
    def tree_max_wrap(self, temp):
        if temp is None:
            return float("-inf")
        else:
            left_max = self.tree_max_wrap(temp.left)
            right_max = self.tree_max_wrap(temp.right)
            return max(temp.value, left_max, right_max)
    def tree_max(self):
        x = self.tree_max_wrap(self.root)
        print("max: ", x)
        
    def tree_min_wrap(self, temp):
        if temp is None:
            return float("inf")
        else:
            left_max = self.tree_min_wrap(temp.left)
            right_max = self.tree_min_wrap(temp.right)
            return min(temp.value, left_max, right_max)
    def tree_min(self):
        x = self.tree_min_wrap(self.root)
        print("max: ", x)
        
    def tree_height_wrap(self, temp: Node):
        if temp is None:
            return 0
        else:
            left_h = self.tree_height_wrap(temp.left)
            right_h = self.tree_height_wrap(temp.right)
            return 1 + max(left_h, right_h)
    def tree_height(self):
        x = self.tree_height_wrap(self.root)
        print("height: ", x)
    
    def is_exist_wrap(self, temp, value):
        if temp is None:
            return False
        else:
            in_left = self.is_exist_wrap(temp.left, value)
            in_right = self.is_exist_wrap(temp.right, value)
            return value == temp.value or in_left or in_right
    def is_exist(self, value):
        x = "exist" if self.is_exist_wrap(self.root, value) else "not exist"
        print(value, x)
    
    #reverse the tree
    def reverse_tree_wrap(self, temp):
        if temp is None:
            return
        else:
            self.reverse_tree_wrap(temp.left)
            self.reverse_tree_wrap(temp.right)
            temp.left, temp.right = temp.right, temp.left
    def reverse_tree(self):
        self.reverse_tree_wrap(self.root)
        
    
    # tree traversal
    
    def inorder_wrap(self, temp):
        if temp:
            self.inorder_wrap(temp.left)
            print(temp.value, end=" ")
            self.inorder_wrap(temp.right)

    def preorder_wrap(self, temp):
        if temp:
            print(temp.value, end=" ")
            self.preorder_wrap(temp.left)
            self.preorder_wrap(temp.right)
    def postorder_wrap(self, temp):
        if temp:
            self.postorder_wrap(temp.left)
            self.postorder_wrap(temp.rigt)
            print(temp.value, end=" ")
        pass
    def inorder_iterative_wrap(self, temp):
        s = []
        curr: Node = temp
        while s or curr:
            if curr:
                s.append(curr)
                curr = curr.left
            else:
                curr = s.pop()
                print(curr.value, end=" ")
                curr = curr.right
                
    def postorder_iterative_wrap():
        pass
    
    def traverse(self, ino=False, preo=False, posto=False, iter=False):
        if iter:
            if ino:
                self.inorder_iterative_wrap(self.root)
                print()
        else:
            if ino:
                self.inorder_wrap(self.root)
                print()
            elif preo:
                self.preorder_wrap(self.root)
            elif posto:
                self.postorder_wrap(self.root)
        
        
if __name__ == "__main__":
    bt = BTree()
    bt.insert(1)
    bt.insert(2)
    bt.insert(3)
    bt.insert(4)
    bt.insert(5)
    bt.insert(6)
    bt.insert(7)
    bt.inorder()
    bt.tree_sum()
    bt.tree_max()
    bt.tree_min()
    bt.tree_height()
    bt.is_exist(4)
    bt.is_exist(14)
    bt.inorder()
    print("tree is reversed")
    bt.reverse_tree()
    bt.inorder()
    print("inordr traversal")
    bt.traverse(ino=True)
    print("inorder iterative traversal")
    bt.traverse(ino=True, iter=True)
    
