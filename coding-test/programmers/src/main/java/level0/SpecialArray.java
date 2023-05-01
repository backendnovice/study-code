package level0;

public class SpecialArray {
    public int solution(int[][] arr) {
        final int LENGTH = arr.length;
        
        int result = 1;
        
        for(int i = 0; i < LENGTH; i++) {
            for(int j = 0; j < LENGTH; j++) {
                if(arr[i][j] != arr[j][i]) {
                    result = 0;
                    break;
                }
            }
        }
        
        return result;
    }
}
