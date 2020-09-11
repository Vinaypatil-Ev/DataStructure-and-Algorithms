class Entry{
    int value;
    Entry next;
    public Entry(int value){
        this.value = value;
        this.next = null;
    }
    public Entry(){
        this.next = null;
    }
}
class HashMap{
    Entry[] hashTable;
    int size;
    public HashMap(int size){
        this.size = size;
        this.hashTable = new Entry[size];
        // for(int i=0; i<size; i++){
        //     hashTable[i] = new Entry();
        // }
    }
    int getHashKey(int value){
        int key = value % size;
        return key;
    }
    public void add(int value){
        int key = getHashKey(value);
        Entry newEntry = new Entry(value);
        // System.out.println("entry "+ newEntry + "|value "+ newEntry.value + "|next "+ newEntry.next);
        if(hashTable[key]==null){
            hashTable[key] = newEntry;
        }else{
            newEntry.next = hashTable[key];
            hashTable[key] = newEntry;
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
                    System.out.print(temp.value + "||");
                    temp = temp.next;
                }
                System.out.println("");
            }
        }
    }

}

public class HashMapImpl {
    public static void main(String[] args){
        HashMap hm = new HashMap(5);
        hm.add(41);
        hm.add(10);
        hm.add(101);
        hm.add(11);
        hm.add(21);
        // System.out.println(hm.hashTable[1].value);
        // System.out.println(hm.hashTable[2].next);
        // System.out.println(hm.hashTable[3].value);
        hm.printHashTable();
    }
}
