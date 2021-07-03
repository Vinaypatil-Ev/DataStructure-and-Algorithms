#include<iostream>

using namespace std;

class stack {
    private:
    int size;
    int* arr;
    int top = -1;
    public:
    stack(int size) {
        this->size = size;
        this->arr = new int[this->size];
    }

    bool isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    bool isFull() {
        if (top == size) {
            return true;
        }
        return false;
    }

    void push(int value) {
        if (!isFull()) {
            top = top + 1;
            arr[top] = value;
        } else {
            printf("Cannot insert %d, array is full\n", value);
        } 
    }

    int pop() {
        if (!isEmpty()) {
            int x = arr[top];
            top = top - 1;
            return x;
        } else {
            printf("pop failed");
        }
    }

    void showStack() {
        if (!isEmpty()) {
            for (int i=top; i>=0; i--) {
                printf("|%d|\n", arr[i]);
            }
        } else {
            printf("array is Empty");
        }
    }
};

int main() {
    stack s(5);
    s.push(10);
    s.push(50);
    s.push(40);
    s.pop();
    s.push(18);
    s.push(23);
    s.push(400);
    s.pop();
    s.push(90);
    s.push(30);
    s.pop();
    s.showStack();
}