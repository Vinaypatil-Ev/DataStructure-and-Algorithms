class Stack<T> {
    int size;
    Object[] stackArray;
    int top;
    public Stack(int size){
        this.size = size;
        this.stackArray = new Object[size];
        this.top = -1;
    }
    boolean isFull(){
        return (top==size-1);
    }
    public void push(Object value){
        if(isFull()){
            System.out.println("Stack is Full");
        }else{
            top = top + 1;
            stackArray[top] = value;
        }

        // try{
        //     top = top + 1;
        //     stackArray[top] = value;
        // }catch(Exception e){
        //     System.out.println("Stack is Full:" + e);
        // }
    }

    boolean isEmpty(){
        return (top==-1);
    }
    public T pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        T item = (T) stackArray[top];
        stackArray[top] = null;
        top = top-1;
        return item;
    }
}

public class StackImpl {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(2);
        st.push(1);
        st.push(2);
        // st.push(3);
        st.pop();
        st.pop();
        // st.pop();
        for(Object no: st.stackArray){
            System.out.println(no);
        }
    }
    
}
