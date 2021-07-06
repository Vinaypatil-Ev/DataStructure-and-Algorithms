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

    boolean isEmpty(){
        return (top==-1);
    }

    public void push(Object value){
        if(isFull()){
            System.out.format("connot insert %d, stack is full\n", value);
        }else{
            top = top + 1;
            stackArray[top] = value;
        }
    }

    public T pop(){
        if(!isEmpty()){
            T item = (T) stackArray[top];
            stackArray[top] = null;
            top = top-1;
            return item;
        }
        System.out.println("pop failed, Stack is empty");
        return null;  
    }
    void showStack() {
        for (int i=size-1; i>=0; i--) {
            if (i <= top) {
                System.out.format("|%d|\n", stackArray[i]);
            } else {
                System.out.println("|  |");
            }
        }
    }
}

public class StackImpl {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>(5);
        st.push(1);
        st.push(2);
        st.pop();
        st.push(20);
        st.push(22);
        st.push(90);
        st.push(23);
        st.push(14);
        st.push(78);
        st.pop();
        st.push(23);
        // st.push(3);
        // st.pop();
        st.pop();
        st.showStack();
    }
    
}
