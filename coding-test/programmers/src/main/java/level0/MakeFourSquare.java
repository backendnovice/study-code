package level0;

public class MakeFourSquare {
    public int[][] solution(int[][] arr) {
        final int ARR_X_LENGTH = arr.length;
        final int ARR_Y_LENGTH = arr[0].length;
        
        if(ARR_X_LENGTH == ARR_Y_LENGTH) {
            return arr;
        }
        
        int[][] arrNew = (ARR_X_LENGTH > ARR_Y_LENGTH) ? new int[ARR_X_LENGTH][ARR_X_LENGTH] : new int[ARR_Y_LENGTH][ARR_Y_LENGTH];
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arrNew[i][j] = arr[i][j];
            }
        }
        
        return arrNew;
    }
}
