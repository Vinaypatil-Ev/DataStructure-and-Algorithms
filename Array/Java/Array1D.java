
public class Array1D {

    public static void main(String[] args){

        int[] NameOfArray = new int[5];
        System.out.println("Length of Array is: "+ NameOfArray.length);     
        int no = 10;
        for(int i=0; i<NameOfArray.length; i++){
            NameOfArray[i] = no;
            no += 7;
        }
        System.out.println("Elements in Array");
        for (int i=0; i<NameOfArray.length; i++){
            System.out.println(NameOfArray[i]);
        }

        
    }
    
}
