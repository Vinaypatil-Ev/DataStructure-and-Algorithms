
class NodeD{
    Object data;
    NodeD next;
    NodeD previous;
    public NodeD(Object data, NodeD next, NodeD previous){
        this.data = data;
        this.next = next;
        this.previous = previous;
    }
}

class DoubleLinkedList<T>{
    NodeD head;
    
    public DoubleLinkedList(NodeD head){
        this.head = head;
    }
    public void add(Object data){
        NodeD newNode = new NodeD(data, null, null);
        if(head == null){
            head = newNode;
        }else{
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void shift(){
        if (head == null){
            throw new NullPointerException("shift on empty list");
        }
        if(head.next == null){
            head = null;
        }else{
            head = head.next;
            head.previous = null;
        }
    }

    public void pop(){
        if(head==null){
            throw new NullPointerException("pop on empty list");
        }
        NodeD temp = head;
        while(temp!=null){
            if(temp.next==null){
                head = null;
                break;
            }
            if(temp.next.next==null){
                temp.next = null;
                break;
            }
            temp = temp.next;
        }
    }

    public void printList(){
        NodeD temp = head;
        int i = 0;
        if(temp==null){
            throw new NullPointerException("Empty list");
        }
        while(temp != null){
            System.out.println("Node" + i + " |" + temp.previous + "|" + (T) temp.data + "|" + temp.next);
            temp = temp.next;
            i++;
        }
    }
}
public class DLinkedListImpl {
    public static void main(String[] args){
        DoubleLinkedList<Integer> ls = new DoubleLinkedList<Integer>(null);
        ls.add(4);
        ls.add(8);
        ls.add(9);
        ls.add(3);
        ls.printList();
        System.out.println("\n shift");
        ls.shift();
        ls.printList();
        System.out.println("\n pop");
        ls.pop();
        ls.printList();


    }
}
