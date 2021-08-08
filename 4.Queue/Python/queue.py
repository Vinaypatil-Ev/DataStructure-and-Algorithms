class Queue:
    def __init__(self, size):
        self.size = size
        self.front = -1
        self.rear = -1
        self.arr = [None] * size
    # check if queue is full
    def is_full(self):
        return self.rear == self.size
    
    # check if queue is empty
    def is_empty(self):
        return self.front == -1
    
    # enque
    def enqueue(self, value):
        if self.is_full():
            print(f"cannont insert {value}")
            return
        self.rear += 1
        self.arr[self.front] = value
        if self.front == -1:
            self.front = 0
        print(f"front {self.front}, rear: {self.rear}")
        print(self.arr)
        
    def dequeue(self):
        if self.is_empty():
            print("dequeue failed")
            return
        self.arr[self.front] = None
        self.rear -= 1
        print(f"front {self.front}, rear: {self.rear}")
        print(self.arr)



if __name__ == "__main__":
    q = Queue(5)
    q.enqueue(10)
    q.enqueue(34)
    q.enqueue(74)
    q.dequeue()
    q.dequeue()
    q.dequeue()
    q.dequeue()
    q.dequeue()
        
        

    