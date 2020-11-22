#include<stdio.h>
#include<stdlib.h>

struct Node* head = NULL;

struct Node
    {
        int value;
        struct Node* next;
};

void add(int value){
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->value = value;
    newNode->next = head;
    head = newNode;
}

void printLinkedList(){
    struct Node* temp = head;
    while(temp != NULL){
        printf("|%d|", temp->value);
        temp = temp->next;
    }
}

int main(){
    add(10);
    add(90);
    add(34);
    add(1);
    add(29);
    printLinkedList();
}