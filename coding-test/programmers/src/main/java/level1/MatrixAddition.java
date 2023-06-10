package level1;

public class MatrixAddition {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 행렬의 크기(ROW,COLUMN)를 변수에 저장하고, 리턴 배열을 초기화.
        final int LENGTH_ROW = arr1[0].length;
        final int LENGTH_COL = arr1.length;
        int[][] result = new int[LENGTH_COL][LENGTH_ROW];
        
        // 같은 행과 열의 숫자를 더하여, 리턴 배열에 삽입.
        for(int i = 0; i < LENGTH_COL; i++) {
            for(int j = 0; j < LENGTH_ROW; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return result;
    }
}
