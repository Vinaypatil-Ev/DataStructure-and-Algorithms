class Entry{
    int key;
    Object value;
    Entry next;
    public Entry(int key, Object value){
        this.key = key;
        this.value = value;
        this.next = null;
    }
    public Entry(){
        this.next = null;
    }
    public int getKey(){
        return key;
    }
}

class HashMap<T>{
    Entry[] hashTable;
    int size;

    public HashMap(int size){
        this.size = size;
        this.hashTable = new Entry[size];
    }

    public void add(int key, Object value){
        Entry newEntry = new Entry(key, value);
        int i = newEntry.getKey();
        if(hashTable[i]==null){
            hashTable[i] = newEntry;
        }else{
            newEntry.next = hashTable[i];
            hashTable[i] = newEntry;
        }
    }

    public void printHashTable(){
        for(int i=0; i<size; i++){
            if(hashTable[i]==null){
                System.out.println(i + "|" + "NUll||");
            }else{
                System.out.print(i+"|");
                Entry temp = hashTable[i];
                while(temp!=null){
                    System.out.print((T)temp.value + "||");
                    temp = temp.next;
                }
                System.out.println("");
            }
        }
    }
}


public class ObjectHashMapImpl {
    public static void main(String[] args){
        HashMap<String> hm = new HashMap<String>(10);
        hm.add(5,"vinay");
        hm.add(5,"patil");
        // System.out.println(hm.hashTable[5].value);
        // System.out.println(hm.hashTable[5].next.value);
        hm.add(1,"hi");
        hm.add(1,"see you");
        hm.add(1,"by");
        hm.add(2,"welcome to show");
        hm.add(2,"***");
        hm.printHashTable();
    }
}
