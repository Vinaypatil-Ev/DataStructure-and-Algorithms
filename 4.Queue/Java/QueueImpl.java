class Queue<T>{
    Object[] QueueArray;
    int size;
    int front;
    int rear;
    public Queue(int size){
        this.size = size;
        this.front = -1;
        this.rear = -1;
        this.QueueArray = new Object[this.size];
    }
    public Boolean isFull(){
        return rear == size-1;
    }
    public Boolean isEmpty(){
        return (front==-1 || front>rear);
    }

    public void insert(Object item){
        if(isFull()){
            System.out.println("Queue is Full");
            return ;
        }
        rear = rear + 1;
        QueueArray[rear] = (T) item; 
        if(front==-1){
            front = 0;
        }
    }
    public T dequeue(){
        if(isEmpty()){
            System.out.println("Cant Queue on Empty");
            return null;
        }
        T item = (T) QueueArray[front];
        QueueArray[front] = null;
        rear = rear - 1;
        return item;
    }
    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return ;
        }
        System.out.print("|");
        for(Object item : QueueArray){
            System.out.print(item + "|");
        }
        System.out.println("");
    }
}


public class QueueImpl {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new Queue<Integer>(5);

        queue.insert(50);
        queue.insert(1);
        queue.insert(90);
        queue.insert(3);
        queue.insert(23);
        // queue.insert(10);
        queue.printQueue();
        System.out.println("After deque");
        queue.dequeue();
        queue.printQueue();
        System.out.println("After deque");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();
        System.out.println("After deque");
        queue.dequeue();
        queue.printQueue();
        System.out.println("After enqueue");
        queue.insert(53);
        queue.insert(33);
        queue.insert(30);
        queue.insert(9);
        queue.insert(93);

    }
}
