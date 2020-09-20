import java.util.Stack;

class Node {
    int value;
    Node next;
    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
}

class adjList{
    Node head;
    public adjList(){
        this.head = null;
    }
}

class DFSGraph{
    int size;
    adjList[] List;
    public DFSGraph(int size){
        this.size = size;
        this.List = new adjList[this.size];
        for(int i=0; i<this.size; i++){
            List[i] = new adjList();
        }
    }

    public void add(int src, int dest){
        Node n = new Node(dest, null);
        n.next = List[dest].head;
        List[dest].head = n;
    }

    public void DFSExplore(int startVertex){
        Boolean[] visited = new Boolean[size];
        for(int i=0; i<size; i++){
            visited[i] = false;
        }
        Stack<Integer> st = new Stack<Integer>();
        st.push(startVertex);
        while (!st.isEmpty()) {
            int n = st.pop();
            st.push(n);
            visited[n] = true;
            Node head = List[n].head;
            Boolean isDone = true;
            while(head!=null){
                if(visited[head.value]==false){
                    st.push(head.value);
                    visited[head.value] = true;
                    isDone = false;
                    break;
                }else{
                    head = head.next;
                }
            }

            if(isDone==true){
                int out = st.pop();
                System.out.println("Visited Node: " + out);
            }
        }
    }
}

public class DFSGraphImpl{
    public static void main(String[] args) {
        DFSGraph dfsg = new DFSGraph(10);
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

        dfsg.DFSExplore(0);

    }
}