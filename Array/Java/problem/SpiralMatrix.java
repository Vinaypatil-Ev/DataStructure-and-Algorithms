
public class SpiralMatrix {

    public static void main(String[] args){
        
            int[][] spiral = {{10,20,30,40},{99,10,45,67},{80,22,30,48},{91,78,94,99}};

            new SpiralMatrix().printSpiral(spiral);
    }
    
    void printSpiral(int[][] spiral){

        int fRow = 0;
        int lRow = spiral.length-1;
        int fCol = 0;
        int lCol = spiral[0].length-1;

        for (int i = 0; i < spiral.length; i++) {
            for(int j=0; j<spiral.length; j++){
                System.out.print(spiral[i][j]+" \t ");
            }
            System.out.println("");
            
        }

        while(fRow<lRow && fCol<lCol){
            
            for(int i=0; i<=lCol; i++){
                System.out.print(spiral[fRow][i]+"|");
            }
            for(int i=fRow+1; i<=lRow; i++){
                // System.out.println(i+""+lRow);
                System.out.print(spiral[i][lRow]+"|");
            }
            for(int i=lCol-1; i>=fCol; i--){
                // System.out.println(i+""+lCol);
                System.out.print(spiral[lCol][i]+"|");
            }
            for(int i=lRow-1; i>fRow+1; i--){
                System.out.print(spiral[i][fCol]+"|");
            }

            fRow++;
            lRow--;
            fCol++;
            lCol--;
        }
    }

    
    
}
