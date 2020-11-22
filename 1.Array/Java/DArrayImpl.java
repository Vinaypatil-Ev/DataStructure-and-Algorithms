import DArray.DynamicArray;

public class DArrayImpl {
    public static void main(String[] args) {
        System.out.println("hi Dynamic Array");

        DynamicArray<Integer> dArray = new DynamicArray<Integer>();

        dArray.append(9);
        System.out.println(dArray.getSize());
        dArray.append(90);
        System.out.println(dArray.getSize());
        dArray.append(9);
        System.out.println(dArray.getSize());
        dArray.append(0);
        System.out.println(dArray.getSize());
        dArray.append(0);
        System.out.println(dArray.getSize());
        // System.out.println(dArray.toString());
    }
}
