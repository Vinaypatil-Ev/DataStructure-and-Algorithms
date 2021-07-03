class Node{
    //
    Object value;
    Node next;
    public Node(Object value, Node next){
        this.value = value;
        this.next = next;
    }
}


class StackLL<T>{
    Node top;
    public StackLL(){
        this.top = null;
    }
    public void push(Object value){
        Node newNode = new Node(value, null);
        if(top == null){
            top =  newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
    }

    public void pop(){
        if(top == null){
            throw new NullPointerException("shift on empty Stack");
        }
        if(top.next == null){
            top = null;
        }else{
            top = top.next;   
        }
    }
        
    public void printStack(){
        Node temp = top;
        if (temp == null){
            System.out.println("Empty list");
        }
        while(temp != null){
            // System.out.println(temp.value);
            System.out.println(" |" + (T)temp.value + "|");
            temp = temp.next;
        }
    }
}
public class StackLLImpl {

    public static void main(String[] args){

        StackLL<Integer> stack = new StackLL<Integer>();
        stack.push(100);
        stack.push(9);
        stack.push(3);
        stack.push(29);
        stack.push(99);
        stack.printStack();
        stack.pop();
        System.out.println("Stack on pop");
        stack.printStack();
        stack.pop();
        System.out.println("Stack on pop");
        stack.printStack();
    }

}