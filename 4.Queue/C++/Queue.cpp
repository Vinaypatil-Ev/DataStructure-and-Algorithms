#include<iostream>
#include<queue>

using namespace std;

template<class T>
class Queue{
    private:
    T *QueueArray;
    int front;
    int rear;

    public:
    int size;
    
    Queue(int size){
        this->size = size;
        this->front = -1;
        this->rear = -1;
        this->QueueArray = new T[this->size];
    }

    bool isFull(){
        return rear == size - 1;
    }

    bool isEmpty(){
        return (front==-1 || front>rear);
    }

    void enqueue(T item){
        if(!isFull()){
            rear = rear + 1;
            QueueArray[rear] = item;
            if(front==-1){
                front = 0;
            }
            cout << "enqueued: " << item << endl;
        }else
        {
            cout << "Queue is full" << endl;
        }
    }

    T dequeue(){
        if(!isEmpty()){
            T item = QueueArray[front];
            QueueArray[front] = 0;
            front = front + 1;
            cout << "dequeued: " << item << endl;
            return item;
        }else{
            cout << "list is Empty" << endl;
            return 0;
        }
    }

    void printQueue(){
        if(!isEmpty()){
            for (int i = rear; i >= front; i--)
            {
                cout << "|" << QueueArray[i] << "|";
            }
            cout << endl;
        }else{
            cout << "Queue is Empty" << endl;
        }
        
    }
};

int main(){
    Queue<int> q(10);
    q.enqueue(12);
    q.enqueue(58);
    q.enqueue(15);
    q.enqueue(78);
    q.printQueue();
    cout << "After 1 dequeue" << endl;
    q.dequeue();
    q.printQueue();
    cout << "After 4 dequeue" << endl;
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    cout << "After 3 enqueue" << endl;
    q.enqueue(20);
    q.enqueue(40);
    q.enqueue(90);
    q.printQueue();
    getwchar();
    
}