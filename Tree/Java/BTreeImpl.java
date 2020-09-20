class Node{
    int value;
    Node leftNode;
    Node rightNode;
    public Node(int value, Node leftNode, Node rightNode){
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
}

class BTree{
    Node root;
    public BTree(){
        this.root = null;
    }

    public void addNode(Node start, Node newNode){
        if(root==null){
            root = newNode;
            return;
        }
        if(start.value<newNode.value){
            if(start.leftNode==null){
                start.leftNode = newNode;
            }
            addNode(start.leftNode, newNode);
        }
        if(start.value>newNode.value){
            if(start.rightNode == null) {
                start.rightNode = newNode;
            }
            addNode(start.rightNode, newNode);
        }
    }
    
    public void add(int value){
        Node newNode = new Node(value, null, null);
        addNode(root, newNode);
    }
}
}

public class BTreeImpl {
    
    public static void main(String[] args){
        BTree bt = new BTree();
        bt.add(5);
        bt.add(10);
        bt.add(3);
        System.out.println(bt.root.leftNode + "|" + bt.root.value+ "|" + bt.root.rightNode);
        System.out.println(bt.root.leftNode.value + "|" + bt.root.value+ "|" + bt.root.rightNode.value);
    }
}