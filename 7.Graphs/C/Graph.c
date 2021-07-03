#include <stdio.h>
#include <stdlib.h>

struct Node {
    int value;
    struct Node* next;
};
struct adjList {
    struct Node* head;
};
struct Graph {
    int v;
    struct adjList* graph;
};

struct Node* newNode(int value) {
    struct Node* node = (struct Node*) malloc(sizeof(struct Node));
    node->value = value;
    node->next = NULL;
    return node;
}

struct Graph* newGraph(int nv) {
    struct Graph* g = (struct Graph*) malloc(sizeof(struct Graph));
    g->v = nv;
    g->graph = (struct adjList*) malloc(nv * sizeof(struct adjList));
    for (int i=0; i<g->v; i++) {
        g->graph[i].head = NULL;
    }
    return g;
};

void add_edge(struct Graph* g, int src, int dest) {
    struct Node* node = newNode(dest);
    node->next = g->graph[src].head;
    g->graph[src].head = node;

    node = newNode(src);
    node->next = g->graph[dest].head;
    g->graph[dest].head = node;
}

void showGraph(struct Graph* g) {
    for (int i=0; i<g->v; i++) {
        printf("[%d]", i);
        struct Node* temp = g->graph[i].head;
        while (temp != NULL) {
            printf("-> %d", temp->value);
            temp = temp->next;
        }
        printf("\n");
    }
}



int main() {
    struct Graph* g = newGraph(5);
    add_edge(g, 0, 1);
    add_edge(g, 2, 1);
    add_edge(g, 3, 1);
    add_edge(g, 4, 1);
    add_edge(g, 2, 3);
    add_edge(g, 4, 3);
    add_edge(g, 4, 2);
    add_edge(g, 4, 4);
    showGraph(g);
}