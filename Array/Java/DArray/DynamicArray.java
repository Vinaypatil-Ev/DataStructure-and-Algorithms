package DArray;

import java.util.Arrays;

public class DynamicArray<T> {

    Object[] data;
    int size;
    
    public DynamicArray(){
        size = 0;
        data = new Object[1];

    }
    public int getSize(){
        return data.length;
    }

    public T get(int index){
        return (T) data[index];
    }

    public void append(T item){
        checkCapacity(size+1);
        data[size++] = item;
    }
    void checkCapacity(int capacity){
        int oldCapacity = getSize();

        if (capacity>oldCapacity){
            int newCapacity = oldCapacity*2;
            if(newCapacity<capacity){
                newCapacity = capacity;
            }
            data = Arrays.copyOf(data, newCapacity);
        }
    }
}
