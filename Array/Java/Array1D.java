
public class Array1D {

    public static void main(String[] args){

        // Array in string

        // Integer Array

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

        // float Array
        
        float[] floatArr = {3.4f, 4.6f, 6.4f, 5.66f};
        for (int i = 0; i < floatArr.length; i++) {
            System.out.println(floatArr[i]);
        }

        // Double Array

        double[] doubleArr = {3.44, 45.66, 45.908, 30.3};
        for (int i = 0; i < doubleArr.length; i++) {
            System.out.println(doubleArr[i]);
        }

        
    }
    
}
