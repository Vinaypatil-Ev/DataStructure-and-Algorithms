class BinaryTree:
    def __init__(self, size):
        self.bt = [None] * size
        self.i = 0
    def parent(self, i):
        return i
    def left(self, i):
        return i * 2 + 1
    def right(self, i):
        return i * 2 + 2
    def isFull(self):
        return self.i == len(self.bt) - 1
    def insert(self, value):
        if self.isFull():
            print(f"insertion failed , tree is full {value}")
        if self.i == 0:
            self.bt[self.parent(self.i)] = value
            self.i += 1
        else:
            if self.i <= len(self.bt):
                self.bt[self.left(self.i)] = value
                self.i += 1
            else:
                self.bt[self.right(self.i)] = value
                self.i += 1
            

if __name__ == "__main__":
    bt = BinaryTree(7)
    bt.insert(10)
    bt.insert(12)
    bt.insert(4)
    # bt.insert(49)
    # bt.insert(75)
    # bt.insert(5)
    # bt.insert(89)
    # bt.insert(34)
    # bt.insert(9)
    print(bt.bt)
        
    