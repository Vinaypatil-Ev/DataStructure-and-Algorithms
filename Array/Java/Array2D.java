
public class Array2D {

    public static void main(String[] args){

        int[][] Name2DArray = new int[3][3];
        // System.out.println(Name2DArray.length);
        for(int i=0; i<Name2DArray.length; i++){
            for(int j=0; j<Name2DArray.length; j++){
                Name2DArray[i][j] = i+j;
            }
        }
        for(int i=0; i<Name2DArray.length; i++){
            for(int j=0; j<Name2DArray.length; j++){
                System.out.print(Name2DArray[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    
}
