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

class DFSGraph{
    int size;
    adjList[] List;
    public DFSGraph(int size){
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

    public void DFSExplore(int startVertex){
        // Node temp = List
        Boolean[] visited = new Boolean[size];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        Stack<Integer> st = new Stack<Integer>();
        st.push(startVertex);
        while(!st.isEmpty()){
            int n = st.pop();
            st.push(n);
            visited[n] = true;
            Node temp = List[n].head;
            Boolean isDone = true;
            while(temp!=null){
                if(visited[temp.value]==false){
                    st.push(temp.value);
                    visited[temp.value] = true;
                    isDone = false;
                    break;
                }else{
                    temp = temp.next;
                }
            }

            if(isDone==true){
                int out = st.pop();
                System.out.println("Visited Node: " + out);
            }
        }
    }
}


class DFSGraphImpl{
    public static void main(String[] args){
        DFSGraph dfsg = new DFSGraph(6);
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
        dfsg.DFSExplore(0);

    }
}