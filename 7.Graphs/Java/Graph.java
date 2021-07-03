class Node{
    int value;
    Node next;
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class Graph{
    int v;
    Node[] graph;
    public Graph(int nv) {
        this.v = nv;
        this.graph = new Node[this.v];
    }

    void add_edge(int src, int dest) {
        Node nodeS = new Node(dest);
        nodeS.next = graph[src];
        graph[src] = nodeS;

        Node nodeD = new Node(src);
        nodeD.next = graph[dest];
        graph[dest] = nodeD;

    }

    void showGraph() {
        for (int i=0; i<graph.length; i++) {
            System.out.format("[%d]", i);
            Node temp = graph[i];
            while (temp != null) {
                System.out.format(" -> %d", temp.value);
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.add_edge(0, 1);
        g.add_edge(2, 1);
        g.add_edge(3, 1);
        g.add_edge(4, 1);
        g.add_edge(2, 4);
        g.add_edge(4, 3);
        g.add_edge(2, 3);
        g.showGraph();
    }
}
