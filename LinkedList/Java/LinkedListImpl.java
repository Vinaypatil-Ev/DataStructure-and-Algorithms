class Node{
    //
    Object value;
    Node next;
    public Node(Object value, Node next){
        this.value = value;
        this.next = next;
    }
}

class LinkedList<T> {
    Node head;
    public LinkedList(Node head){
        this.head = head;
    }

    public void add(Object value){
        Node newNode = new Node(value, null);
        if(head == null){
            head =  newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    } 

    public void shift(){
        if(head == null){
            throw new NullPointerException("shift on empty list");
        }
        if(head.next == null){
            head = null;
        }else{
            head = head.next;   
        }
    }

    public void pop(){
        Node temp = head;
        if (temp == null){
            throw new NullPointerException("Pop on empty list");
        }
        while (temp != null) {
            if (temp.next == null){
                System.out.println("single list");
                head = null;
                break;
            }
            if (temp.next.next == null){
                temp.next = null;
                break;
            }
            temp = temp.next;
        }
    }
        
    public void printList(){
        Node temp = head;
        int i = 0;
        if (temp == null){
            System.out.println("Empty list");
        }
        while(temp != null){
            // System.out.println(temp.value);
            System.out.println("Node" + i + " |" + (T)temp.value + "|" + temp.next + "|");
            temp = temp.next;
            i++;
        }
    }
}

public class LinkedListImpl{
    public static void main(String[] args) {
        
        LinkedList<Integer> ls = new LinkedList<Integer>(null);
        ls.add(1);
        ls.add(77);
        ls.add(88);
        ls.add(8);
        ls.add(80);
        ls.add(9);
        ls.printList();
        System.out.println("pop list");
        ls.pop();
        ls.printList();
        System.out.println("shift list list");
        ls.shift();
        ls.printList();
        System.out.println("\n string list");
        LinkedList ls2 = new LinkedList(null);
        ls2.add("a");
        ls2.add("z");
        ls2.printList();
        System.out.println("pop list");
        ls2.pop();
        ls2.printList();
        System.out.println("shift list list");
        ls2.shift();
        ls2.printList();
    }

}

