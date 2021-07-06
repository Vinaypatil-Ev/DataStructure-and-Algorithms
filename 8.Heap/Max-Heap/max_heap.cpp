class Heap {
    public:
    int []arr;
    int maxsize;
    int size;
    public:
    Heap(int size) {
        this->maxsize = size;
        this->arr = new int[this->size];
        this->size = size;
    }
}