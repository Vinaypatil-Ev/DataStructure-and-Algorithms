import java.util.ArrayList;
import java.util.Collections;

// package Array.Java.problem;

public class maxSequence {

    public static void main(String[] args){

        int[] arr = {1,1,0,1,1,0,1,1,1,0,1};
        ArrayList<Integer> listA = new ArrayList<Integer>();
        int addSequence = 0;
        for (int i=0; i<arr.length; i++){

            if(arr[i]==1){
                addSequence += 1;
                if(i==arr.length-1 && arr[arr.length-1]==1 ){
                    listA.add(addSequence);
                }
            }
            else{
                if(addSequence>=1){
                    listA.add(addSequence);
                    listA.add(0);
                }
                addSequence=0;
            }

        }
        
        System.out.println(listA.toArray()[0]);
        System.out.println(listA);
        System.out.println("Max sequence in array is: " + (Collections.max(listA) + 1) );
    }
    
}
