import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    int value;
    Node next;
    public Node(int value){
        this.value = value;
        this.next = null;
    }
}

class adjList{
    int value;
    Node head;
    public adjList(){
        this.head = null;
    }

}

class BFSGraph{
    int size;
    adjList[] List;
    public BFSGraph(int size){
        this.size = size;
        this.List = new adjList[this.size];
        for (int i = 0; i < List.length; i++) {
            List[i] = new adjList();
        }
    }

    public void add(int src, int dest){
        Node newNode = new Node(dest);
        newNode.next = List[src].head;
        List[src].head = newNode;
    }

    public void printAdjList(){
        for (int i = 0; i < List.length; i++) {
            System.out.print(List[i]);
            Node temp = List[i].head;
            while(temp!=null){
                System.out.print("--> |" + temp.value + "|" + temp.next + "|");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    public void BFSExplore(int startVertex){
        // Node temp = List
        Boolean[] visited = new Boolean[size];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(startVertex);
        while(!q.isEmpty()){
            int n = q.poll();
            System.out.println("Visited Node: " + n);
            visited[n] = true;
            Node temp = List[n].head;
            while(temp!=null){
                if(visited[temp.value]==false){
                    q.add(temp.value);
                    visited[temp.value] = true;
                }else{
                    temp = temp.next;
                }
            }
        }
    }
}


class BFSGraphImpl{
    public static void main(String[] args){
        BFSGraph dfsg = new BFSGraph(6);
        dfsg.add(0, 2);
        dfsg.add(0, 1);
        dfsg.add(1, 3);
        dfsg.add(1, 4);
        dfsg.add(2, 5);
        dfsg.add(1, 0);
        dfsg.add(2, 0);
        dfsg.add(3, 1);
        dfsg.add(4, 1);
        dfsg.add(5, 2);
        System.out.println("Adjcency List : ");
        dfsg.printAdjList();
        System.out.println("");
        System.out.println("DFS Graph Explore : ");
        dfsg.BFSExplore(0);

    }
}