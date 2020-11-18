#include<stdio.h>

struct Node* head = NULL;

struct Node
    {
        int value;
        struct Node* next;
        
    };

void add(int value){
    struct Node newNode = {value, NULL};
    struct Node x;
    printf("pt: %d .. %d v: %d ", &newNode, &x, value);
    printf("head: %d \n", head);
    if(head == NULL){
        head = &newNode;
        printf("heading\n");
        
    }else
    {
        newNode.next = head;
        head = &newNode;
        printf("sub Heading\n");
    }
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
    // printLinkedList();
    printf("%d|",head->value);
    printf("%d|",head->next->value);
    printf("%d|",head->next->next);
    // print("%d|",head->value);
    // print("%d|",head->value);
}