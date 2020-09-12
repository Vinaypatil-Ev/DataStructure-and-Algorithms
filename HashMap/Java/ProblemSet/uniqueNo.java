import java.util.ArrayList;
import java.util.HashMap;

public class uniqueNo{
    public static void main(String[] args) {
        int[] array = {5,1,2,4,2,4,8,9,9,1,5,6,7,7,8};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<array.length; i++){
            if(hm.get(array[i])!=null){
                int count = hm.get(array[i]) + 1;
                hm.put(array[i], count);
            }else{
                hm.put(array[i], 1);
            }
        }
        System.out.println("Unique values in Array are:");
        System.out.println(hm.keySet());
    }
}