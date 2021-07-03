#include <iostream>

using namespace std;

class Node {
    public:
    int value;
    Node *next;
    Node(int v) {
        value = v;
        next = NULL;
    }
};

// graph using adjecency list
class Graph {
    public:
    int v;
    Node *graph[];
    Graph(int nv) {
        v = nv;
        for (int i=0; i<v; i++) {
            graph[i] = NULL;
        }
    }

    void add_edge(int src, int dest) {
        Node* nodeS = new Node(dest);
        nodeS->next = graph[src];
        graph[src] = nodeS;

        Node* node = new Node(src);
        node->next = graph[dest];
        graph[dest] = node;
        
    }

    void showGraph() {
        for (int i=0; i<v; i++) {
            printf("[%d]", i);
            Node* temp = graph[i];
            while (temp != NULL)
            {
                printf("-> %d", temp->value);
                temp = temp->next;
            }
            printf("\n");
        }
    }
};

int main() {
    Graph g(5);
    g.add_edge(0, 1);
    g.add_edge(2, 3);
    g.add_edge(3, 4);
    g.add_edge(2, 1);
    g.add_edge(3, 1);
    g.add_edge(1, 4);
    g.add_edge(2, 0);
    g.showGraph();
    
}
