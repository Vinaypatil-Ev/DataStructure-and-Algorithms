#include<iostream>

using namespace std;

class Node{
    public:
    int value;
    Node *next;
    Node(int value){
        this -> value = value;
        this -> next = NULL;
    }
};

class linkedList{
    public:
    Node *head;
    linkedList(){
        this -> head = NULL;
    } 

    void add(int value){
        Node* newNode = new Node(value);
        if(head == NULL){
            head = newNode;
        }else
        {
            newNode->next = head;
            head = newNode;
        }  
    }
    
    void printLinkedList(){
        Node* temp = head;
        while(temp != NULL){
            cout << temp->value << "|";
            temp = temp->next;
        }
        cout << endl;
    }
};


int main(){
    linkedList* ls = new linkedList();
    ls->add(10);
    ls->add(14);
    ls->add(14);
    ls->add(15);
    ls->add(12);
    ls->printLinkedList();
    return 0;

}

