class MinHeap:
    def __init__(self, cap):
        self.capacity = cap
        self.arr = []
        self.size = 0
    def parent(self, i):
        return (i - 1) / 2
    def left(self, i):
        return i*2 + 1
    def right(self, i):
        return i*2 + 2
    def insert(self, value):
        if self.size == self.capacity:
            print(f"Heap overflow, insertion failed {value}")
        
        
        
        
#|1|2|3|4|
#parent 
        